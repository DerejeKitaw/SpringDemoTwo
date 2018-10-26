package com.dkitaw.springdemotwo.controller;

import java.util.List;

import com.dkitaw.springdemotwo.model.Users;
import com.dkitaw.springdemotwo.model.UsersContact;
import com.dkitaw.springdemotwo.repository.UsersContactRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/usercontact")
@RestController
public class UsersContactController {
  private UsersContactRepository usersContactRepository;

  private UsersContactController(UsersContactRepository usersContactRepository) {
    this.usersContactRepository = usersContactRepository;
  }

  @GetMapping
  public List<UsersContact> getUsersContact() {
    return usersContactRepository.findAll();
  }

  @GetMapping(value = "/update/{name}")
  public List<UsersContact> update(@PathVariable final String name) {
    UsersContact usersContact = new UsersContact();
    Users users = new Users();
    users.setName(name).setTeamName("name").setSalary(2300);
   usersContact.setPhoneNo(2345);
usersContactRepository.save(usersContact).setUsers(users);
return usersContactRepository.findAll();
  }
}