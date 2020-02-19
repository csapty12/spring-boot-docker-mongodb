package com.example.persondemo.repository;

import com.example.persondemo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoDbRepository extends MongoRepository<Person, String> {

    <S extends Person> S save(S entity);
}
