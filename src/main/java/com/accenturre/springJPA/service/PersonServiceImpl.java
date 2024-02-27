package com.accenturre.springJPA.service;

import com.accenturre.springJPA.data.model.PersonEntity;
import com.accenturre.springJPA.data.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{

    public final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void create(PersonEntity person) {
        personRepository.save(person);
    }
}
