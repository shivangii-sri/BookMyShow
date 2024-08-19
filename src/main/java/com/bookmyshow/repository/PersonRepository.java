package com.bookmyshow.repository;

import com.bookmyshow.entity.users.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
