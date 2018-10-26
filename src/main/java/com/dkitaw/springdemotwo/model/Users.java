package com.dkitaw.springdemotwo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Users {

  @Id@GeneratedValue
private Long id;
private String name;
private String teamName;
private Integer salary;

public Users(){
  
}
  public Long getId() {
    return this.id;
  }

  public Users setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return this.name;
  }

  public Users setName(String name) {
    this.name = name;
    return this;
  }

  public String getTeamName() {
    return this.teamName;
  }

  public Users setTeamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  public Integer getSalary() {
    return this.salary;
  }

  public Users setSalary(Integer salary) {
    this.salary = salary;
    return this;
  }
}