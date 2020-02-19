package com.example.persondemo.controller;

import com.example.persondemo.model.Person;
import com.example.persondemo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonController {

  private final PersonService personService;
  @PostMapping("/save/{name}")
  public ResponseEntity<Person> savePerson(@PathVariable("name") String name){
    Person person = Person.builder().name(name).build();
    Person savedPerson = personService.save(person);
    return ResponseEntity.ok().body(savedPerson);
  }

}
