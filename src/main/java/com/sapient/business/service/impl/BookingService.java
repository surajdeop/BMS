package com.sapient.business.service.impl;

import com.sapient.business.provider.SeatLockProvider;
import com.sapient.data.model.Booking;
import com.sapient.data.model.Seat;
import com.sapient.data.model.Show;
import com.sapient.exception.BadRequestException;
import com.sapient.exception.NotFoundException;
import com.sapient.exception.SeatPermanentUnavailableException;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class BookingService {
    private Map<String, Booking> bookingMap;

    private SeatLockProvider seatLockProvider;

    public Booking getBooking(String bookingId) {
        if (!bookingMap.containsKey(bookingId)) {
            throw new NotFoundException();
        }
        return bookingMap.get(bookingId);
    }

    public List<Booking> getAllBookings(Show show) {
        return new ArrayList<>();
    }

    public List<Seat> getBookedSeats(Show show) {
        return getAllBookings(show).stream().filter(Booking::isConfirmed).
                map(Booking::getSeatsBooked).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public Booking createBooking(String userId, Show show, List<Seat> seats) {
        if (isAnySeatAlreadyBooked(show, seats)) {
            throw new SeatPermanentUnavailableException();
        }
        seatLockProvider.lockSeats(show, seats, userId);
        String bookingId = UUID.randomUUID().toString();
        Booking newBooking = new Booking(bookingId, userId, show, seats);
        bookingMap.put(bookingId, newBooking);
        return newBooking;
    }

    private boolean isAnySeatAlreadyBooked(Show show, List<Seat> seats) {
        final List<Seat> bookedSeats = getBookedSeats(show);
        for (Seat seat : seats) {
            if (bookedSeats.contains(seat)) {
                return true;
            }
        }
        return false;
    }

    public void confirmedBooking(Booking booking, String user) {
        if (!booking.getUserId().equals(user)) {
            throw new BadRequestException();
        }
        for (Seat seat : booking.getSeatsBooked()) {
            if (!seatLockProvider.validateLock(booking.getShow(), seat, user)) {
                throw new BadRequestException();
            }
        }
        booking.confirmBooking();
    }


}
