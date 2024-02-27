package com.accenturre.springJPA.controller;

import com.accenturre.springJPA.data.model.PersonEntity;
import com.accenturre.springJPA.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private final PersonService personServiceImpl;
    @Autowired
    public PersonController(PersonService personServiceImpl) {
        this.personServiceImpl = personServiceImpl;
    }
    @PostMapping("/api/person/v1")
    public void createPerson(@RequestBody PersonEntity person) {
        personServiceImpl.create(person);
    }
}
