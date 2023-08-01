package com.bookmyshow.entity;

import com.bookmyshow.entity.common.BaseEntity;
import com.bookmyshow.entity.movie.Show;
import com.bookmyshow.entity.movie.ShowSeat;
import com.bookmyshow.entity.users.Person;
import com.bookmyshow.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "booking")
public class Booking extends BaseEntity {

    private int numberOfSeat;
    private Date bookedOn;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    @ManyToOne
    private Person person;

    @OneToMany(cascade = CascadeType.ALL , orphanRemoval = true, mappedBy = "booking")
    private List<ShowSeat> showSeat;

    @ManyToOne
    private Show show;


}
