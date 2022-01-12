package com.sapient.business.provider.impl;

import com.sapient.business.provider.SeatLockProvider;
import com.sapient.business.provider.model.SeatLock;
import com.sapient.data.model.Seat;
import com.sapient.data.model.Show;
import com.sapient.exception.SeatPermanentUnavailableException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InMemorySeatLockProvider implements SeatLockProvider {
    private int lockTimeout;
    private Map<Show, Map<Seat, SeatLock>> locks;


    @Override
    public void lockSeats(Show show, List<Seat> seats, String user) {
        for (Seat seat : seats) {
            if (isSeatLocked(show, seat)) {
                throw new SeatPermanentUnavailableException();
            }
        }
        for (Seat seat : seats) {
            lockSeat(show, seat, user, lockTimeout);
        }
    }

    private void lockSeat(Show show, Seat seat, String user, int lockTimeout) {
        if (!locks.containsKey(show)) {
            locks.put(show, new HashMap<>());
        }
        final SeatLock seatLock = new SeatLock(seat, show, lockTimeout, new Date(), user);
        locks.get(show).put(seat, seatLock);
    }

    private boolean isSeatLocked(Show show, Seat seat) {
        return locks.containsKey(show) && locks.get(show).containsKey(seat) && !locks.get(show).get(seat).isLockedExpired();
    }

    @Override
    public void unlockSeats(Show show, List<Seat> seats, String user) {
        for (Seat seat : seats) {
            if (validateLock(show, seat, user)) {
                unlockSeat(show, seat);
            }
        }
    }

    private void unlockSeat(Show show, Seat seat) {
        if (!locks.containsKey(show)) {
            return;
        }
        locks.get(show).remove(seat);
    }

    @Override
    public boolean validateLock(Show show, Seat seat, String user) {
        return isSeatLocked(show, seat) && locks.get(show).get(seat).getLockedBy().equals(user);
    }

    @Override
    public List<Seat> getLockedSeats(Show show) {
        if (!locks.containsKey(show)) {
            return Collections.emptyList();
        }
        final List<Seat> lockedSeats = new ArrayList<>();
        for (Seat seat : locks.get(show).keySet()) {
            if (isSeatLocked(show, seat)) {
                lockedSeats.add(seat);
            }
        }
        return lockedSeats;
    }
}
