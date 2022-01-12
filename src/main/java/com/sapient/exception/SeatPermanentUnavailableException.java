package com.sapient.exception;


public class SeatPermanentUnavailableException extends RuntimeException {
    public SeatPermanentUnavailableException() {
    }

    public SeatPermanentUnavailableException(String message) {
        super(message);
    }

    public SeatPermanentUnavailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public SeatPermanentUnavailableException(Throwable cause) {
        super(cause);
    }

    public SeatPermanentUnavailableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
