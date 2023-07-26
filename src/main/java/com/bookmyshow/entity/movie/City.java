package com.bookmyshow.entity.movie;

import com.bookmyshow.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "city")
public class City extends BaseEntity {
    private String name;
    private String state;
    private String zipCode;


}
