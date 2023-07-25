package com.bookmyshow.entity.movie;

import com.bookmyshow.entity.Address;

import java.util.List;

public class Cinema {

    private String name;
    private int totalCinemaHalls;

    private Address location;
    private List<CinemaHall> halls;
}
