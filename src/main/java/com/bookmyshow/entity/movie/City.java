package com.bookmyshow.entity.movie;

import com.bookmyshow.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "city")
public class City extends BaseEntity {
    private String name;
    private String state;
    private String zipCode;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    List<Theatre> theatres;
}
