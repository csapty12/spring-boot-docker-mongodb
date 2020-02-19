package com.example.persondemo.service;

import com.example.persondemo.model.Person;
import java.util.List;

public interface PersonService {
  Person save(Person person);
  List<Person> findAll();
}
