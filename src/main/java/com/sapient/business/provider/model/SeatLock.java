package com.sapient.business.provider.model;

import com.sapient.data.model.Seat;
import com.sapient.data.model.Show;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.Date;

@AllArgsConstructor
@Getter
public class SeatLock {
    private Seat seat;
    private Show show;
    private int timeoutInSeconds;
    private Date lockTime;
    private String lockedBy;

    public boolean isLockedExpired() {
        final Instant lockInstant = lockTime.toInstant().plusSeconds(timeoutInSeconds);
        final Instant currentInstant = new Date().toInstant();
        return lockInstant.isBefore(currentInstant);
    }

}
