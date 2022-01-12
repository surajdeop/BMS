package com.sapient.business.provider;

import com.sapient.data.model.Seat;
import com.sapient.data.model.Show;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeatLockProvider {
    void lockSeats(Show show, List<Seat> seats, String user);
    void unlockSeats(Show show, List<Seat> seats, String user);
    boolean validateLock(Show show, Seat seat, String user);

    List<Seat> getLockedSeats(Show show);
}
