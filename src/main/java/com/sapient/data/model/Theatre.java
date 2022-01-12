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
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"theatre_name", "fk_place_id"})})
public class Theatre extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "theatre_id")
    private Long theatreId;
    @Column(name = "theatre_name", length = 50)
    private String theatreName;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "fk_place_id", referencedColumnName = "place_id")
    private Place place;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_theatre_id", referencedColumnName = "theatre_id")
    private final List<Screen> screens = new ArrayList<>();

    @Override
    public String toString() {
        return "Theatre{" +
                "theatreId=" + theatreId +
                ", theatreName='" + theatreName + '\'' +
                '}';
    }
}
