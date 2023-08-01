package com.bookmyshow.entity.movie;

import com.bookmyshow.entity.Booking;
import com.bookmyshow.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "show_seat")
public class ShowSeat extends BaseEntity {

    private boolean isReserved;
    private double price;

    @ManyToOne
    private Show show;

    @ManyToOne
    private Booking booking;
}
