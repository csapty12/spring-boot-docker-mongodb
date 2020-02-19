package com.example.persondemo.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@EqualsAndHashCode
@Builder
@Document
public class Person {

  @Id
  private String id;
  private String name;
  private int age;
  private String school;
}
