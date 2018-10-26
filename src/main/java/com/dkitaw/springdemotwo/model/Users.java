package com.dkitaw.springdemotwo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {

  @Id@GeneratedValue
private Long id;
private String name;
private String teamName;
private Integer salary;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTeamName() {
    return this.teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public Integer getSalary() {
    return this.salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }
}