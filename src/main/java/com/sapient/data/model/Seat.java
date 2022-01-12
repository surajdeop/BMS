package com.sapient.data.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
//@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"row_no", "seat_no", "fk_screen_id"})})
@Table
public class Seat extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private Integer seatId;
    @Column(name = "row_no", length = 5)
    private String rowNo;
    @Column(name = "seat_no")
    private Integer seatNo;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "fk_screen_id", referencedColumnName = "screen_id")
    private Screen screen;

    @Override
    public String toString() {
        return "Seat{" +
                "seatId=" + seatId +
                ", rowNo='" + rowNo + '\'' +
                ", seatNo=" + seatNo +
                '}';
    }
}