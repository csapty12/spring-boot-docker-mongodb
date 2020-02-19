package com.example.persondemo.controller;

import com.example.persondemo.model.Person;
import com.example.persondemo.service.PersonService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonController {

  private final PersonService personService;

  @PostMapping("/save")
  public ResponseEntity<Person> savePerson(@RequestBody Person person){
    Person savedPerson = personService.save(person);
    return ResponseEntity.ok().body(savedPerson);
  }

  @GetMapping("/findAll")
  public List<Person> findAllPeople() {
    return  personService.findAll();
  }
}
