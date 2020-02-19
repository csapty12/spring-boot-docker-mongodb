package com.example.persondemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@EqualsAndHashCode
@Document
@AllArgsConstructor
@ToString
public class Person {

  @Id
  private String id;
  private String name;
  private Integer age;
  private String school;
}
