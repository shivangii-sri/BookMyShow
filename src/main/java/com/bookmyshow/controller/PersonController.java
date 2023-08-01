package com.bookmyshow.controller;

import com.bookmyshow.entity.users.Person;
import com.bookmyshow.repository.PersonRepository;
import com.bookmyshow.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@CrossOrigin("*")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/create")
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }
}
