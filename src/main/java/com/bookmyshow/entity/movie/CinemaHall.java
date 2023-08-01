package com.bookmyshow.entity.movie;

import com.bookmyshow.entity.common.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cinema_hall")
public class CinemaHall extends BaseEntity {

    private String name;
    private int totalSeats;

    @ManyToOne
    @JoinColumn(name = "theatre")
    private Theatre theatre;

    @OneToMany(mappedBy = "cinemaHall",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private List<CinemaHallSeat> seats;



    /*
    * For shivangi's doubt, why realtionship b/w show and cinema hall is not Many to Many
    * - b/coz, show is decide by cinema i.e when they want to keep a particular show for themselves,
    * so, show can vary from cinema to cinema
    *
    * */
    @OneToMany(mappedBy = "cinema",cascade = CascadeType.ALL,orphanRemoval = true,fetch=FetchType.EAGER)
    @JsonIgnore
    private List<Show> show;
}