package com.sapient.business.service.impl;

import com.sapient.business.provider.SeatLockProvider;
import com.sapient.data.model.Booking;
import com.sapient.exception.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentsService {
    private Map<Booking, Integer> bookingFailure;
    private int allowedRetries;
    @Autowired
    private SeatLockProvider seatLockProvider;

    public void processPaymentFailed(Booking booking, String user) {
        if (!booking.getUserId().equals(user)) {
            throw new BadRequestException();
        }

        if (!bookingFailure.containsKey(booking)) {
            bookingFailure.put(booking, 0);
        }
        final Integer currentFailureCount = bookingFailure.get(booking);
        final Integer newFailureCount = currentFailureCount + 1;
        bookingFailure.put(booking, newFailureCount);
        if (newFailureCount > allowedRetries) {
            seatLockProvider.unlockSeats(booking.getShow(), booking.getSeatsBooked(), booking.getUserId());
        }
    }
}
