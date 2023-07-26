package com.bookmyshow.entity.users;

import com.bookmyshow.entity.common.BaseEntity;
import com.bookmyshow.enums.AccountStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "account")
public class Account extends BaseEntity {

    private String password;

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;
}
