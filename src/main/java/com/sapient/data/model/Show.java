package com.sapient.data.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Show extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "show_id")
    private Integer showId;
    @Column(name = "show_date")
    private java.sql.Date showDate;
    @Column(name = "show_time")
    private java.sql.Time showTime;
    //private int durationInSec;
    @Column(name = "price")
    private double price;
    @OneToOne
    @JoinColumn(name = "fk_movie_id", referencedColumnName = "movie_id")
    private Movie movie;
    @OneToOne
    @JoinColumn(name = "fk_screen_id", referencedColumnName = "screen_id")
    private Screen screen;
}
