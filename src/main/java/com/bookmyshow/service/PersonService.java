package com.bookmyshow.service;

import com.bookmyshow.entity.users.Person;
import com.bookmyshow.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person createPerson(Person person) {

        Person newPerson = personRepository.save(person);
        return newPerson;
    }
}
