package com.sapient.data.model;

import com.sapient.exception.InvalidStateException;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Integer bookingId;
    private String userId;
    @OneToOne
    @JoinColumn(name = "fk_show_id")
    private Show show;
    @OneToMany(fetch = FetchType.LAZY)
    //@JoinColumn(name = "fk_seat_id", referencedColumnName = "seat_id")
    private List<Seat> seatsBooked =  new ArrayList<>();
    @Enumerated(EnumType.STRING)
    @Column(name = "booking_status",nullable = false)
    private BookingStatus bookingStatus;

    public Booking() {

    }

    public Booking(@NonNull String bookingId, String userId, @NonNull Show show, @NonNull List<Seat> seatsBooked) {
        //this.bookingId = bookingId;
        this.userId = userId;
        this.show = show;
        this.seatsBooked = seatsBooked;
        this.bookingStatus = BookingStatus.CREATED;
    }

    public boolean isConfirmed() {
        return BookingStatus.CONFIRMED.equals(this.bookingStatus);
    }

    public void confirmBooking() {
        if (BookingStatus.CREATED.equals(this.bookingStatus)) {
            throw new InvalidStateException("Booking Not Confirmed");
        }
        this.bookingStatus = BookingStatus.CONFIRMED;
    }

    public void expiredBooking() {
        if (BookingStatus.CREATED.equals(this.bookingStatus)) {
            throw new InvalidStateException("Booking Not Confirmed and got expired");
        }
        this.bookingStatus = BookingStatus.EXPIRED;
    }
}
