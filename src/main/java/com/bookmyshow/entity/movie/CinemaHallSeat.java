package com.bookmyshow.entity.movie;

import com.bookmyshow.entity.common.BaseEntity;
import com.bookmyshow.enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cinema_hall_seat")
public class CinemaHallSeat extends BaseEntity {
    private int seatRow;
    private int seatColumn;


    @ManyToOne
    @JoinColumn(name = "cinema_hall")
    private CinemaHall cinemaHall;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;
}
