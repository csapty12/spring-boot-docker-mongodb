package com.example.persondemo.repository;

import com.example.persondemo.model.Person;
import java.util.List;
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

  @Override
  public List<Person> findAll() {
    return mongoDbRepository.findAll();
  }
}
