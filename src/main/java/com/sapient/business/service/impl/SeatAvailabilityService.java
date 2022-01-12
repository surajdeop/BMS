package com.sapient.business.service.impl;

import com.sapient.data.model.Seat;
import com.sapient.data.model.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeatAvailabilityService {
    @Autowired
    private BookingService bookingService;

    public List<Seat> getAvailableSeats(Show show) {
        final List<Seat> allSeats = show.getScreen().getSeats();
        final List<Seat> unavailableSeats = getUnavailableSeats(show);
        return new ArrayList<>();
    }

    private List<Seat> getUnavailableSeats(Show show) {
        final List<Seat> unavailableSeats = bookingService.getBookedSeats(show);

        return unavailableSeats;
    }
}
