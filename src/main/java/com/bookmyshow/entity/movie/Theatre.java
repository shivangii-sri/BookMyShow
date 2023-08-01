package com.bookmyshow.entity.movie;

import com.bookmyshow.entity.Address;
import com.bookmyshow.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "theatre")
public class Theatre extends BaseEntity {

    private String name;
    private int totalCinemaHalls;

    @ManyToOne
    @JoinColumn(name = "city")
    private City city;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address location;

    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private List<CinemaHall> halls;
}
