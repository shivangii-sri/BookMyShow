package com.bookmyshow.entity.users;

import com.bookmyshow.entity.Address;
import com.bookmyshow.entity.Booking;
import com.bookmyshow.entity.common.BaseEntity;
import com.bookmyshow.enums.PersonType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "person")
public abstract class Person extends BaseEntity {
    private String name;

    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    private Address address;

    private String email;
    private String phone;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "account_id")
    private Account account;


    @Enumerated(EnumType.STRING)
    private PersonType personType;

    @OneToMany(cascade = CascadeType.ALL , orphanRemoval = true, mappedBy = "person")
    private List<Booking> booking;
}
