package com.bookmyshow.entity.movie;

import com.bookmyshow.entity.users.Admin;

import java.util.Date;
import java.util.List;

public class Movie {

    private String title;
    private String decription;
    private int durationInMins;
    private String language;
    private Date releaseDate;
    private String country;
    private String genre;
    private Admin movieAddedBy;

    private List<Show> shows;

}
