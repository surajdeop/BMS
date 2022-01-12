package com.sapient.data.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"screen_name", "fk_theatre_id"})})
public class Screen extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "screen_id")
    private Integer screenId;
    @Column(name = "screen_name", nullable = false)
    private String screenName;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "fk_theatre_id", referencedColumnName = "theatre_id")
    private Theatre theatre;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_screen_id", referencedColumnName = "screen_id")
    private final List<Seat> seats = new ArrayList<>();


    @Override
    public String toString() {
        return "Screen{" +
                "screenId=" + screenId +
                ", screenName='" + screenName + '\'' +
                '}';
    }
}