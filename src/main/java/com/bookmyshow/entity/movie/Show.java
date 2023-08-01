package com.bookmyshow.entity.movie;

import com.bookmyshow.entity.Booking;
import com.bookmyshow.entity.common.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "movie_show")
public class Show extends BaseEntity {

    private Date createdOn;
    private Date startTime;
    private Date endTime;

    @ManyToOne
    @JoinColumn(name = "cinema_hall")
    private CinemaHall cinema;

    @ManyToOne
    @JoinColumn(name = "movie")
    private Movie movie;

    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    private List<ShowSeat> showSeatList;

    @OneToMany(cascade = CascadeType.ALL , orphanRemoval = true, mappedBy = "show")
    private List<Booking> booking;


}
