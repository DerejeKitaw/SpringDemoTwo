package com.dkitaw.springdemotwo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users_contact", catalog="springbootdemo") // Database name=springbootdemo
public class UsersContact {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
private Integer phoneNo;


@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="id",referencedColumnName="id") // not required. Is default. if id is deferent needed
private Users users;

  public Users getUsers() {
    return this.users;
  }

  public UsersContact setUsers(Users users) {
    this.users = users;
    return this;
  }
  public Integer getId() {
    return this.id;
  }

  public UsersContact setId(Integer id) {
    this.id = id;
    return this;
  }

  public Integer getPhoneNo() {
    return this.phoneNo;
  }

  public UsersContact setPhoneNo(Integer phoneNo) {
    this.phoneNo = phoneNo;
    return this;
  }

}