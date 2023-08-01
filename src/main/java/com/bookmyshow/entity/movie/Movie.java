package com.bookmyshow.entity.movie;

import com.bookmyshow.entity.common.BaseEntity;
import com.bookmyshow.entity.users.Person;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "movie")
public class Movie extends BaseEntity {

    private String title;
    private String decription;
    private int durationInMins;
    private String language;
    private Date releaseDate;
    private String country;
    private String genre;

    @OneToOne
    @JoinColumn(name = "admin_id")
    private Person movieAddedBy;

    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Show> shows;

}
