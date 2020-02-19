package com.example.persondemo.repository;

import com.example.persondemo.model.Person;
import java.util.List;

public interface PersonRepository {

  Person save(Person person);

  List<Person> findAll();
}
