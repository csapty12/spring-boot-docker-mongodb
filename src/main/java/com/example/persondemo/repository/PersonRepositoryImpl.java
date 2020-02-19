package com.example.persondemo.repository;

import com.example.persondemo.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PersonRepositoryImpl implements  PersonRepository{

  private final MongoDbRepository mongoDbRepository;
  @Override
  public Person save(Person person) {
    return mongoDbRepository.save(person);
  }
}
