package com.example.persondemo.service;

import com.example.persondemo.model.Person;
import com.example.persondemo.repository.PersonRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService{

  private final PersonRepository personRepository;

  @Override
  public Person save(Person person) {
    return personRepository.save(person);
  }

  @Override
  public List<Person> findAll() {
    return personRepository.findAll();
  }
}
