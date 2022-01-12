package com.sapient.data.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"city", "state"})})
public class Place extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id")
    private Integer placeId;
    @Column(length = 50, nullable = false)
    private String city;
    @Column(length = 50, nullable = false)
    private String state;
    @Column(length = 50, nullable = false)
    private String country;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "place")
    private final List<Theatre> theatres = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return city.equals(place.city) && state.equals(place.state) && country.equals(place.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, state, country);
    }

    @Override
    public String toString() {
        return "Place{" +
                "placeId=" + placeId +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
