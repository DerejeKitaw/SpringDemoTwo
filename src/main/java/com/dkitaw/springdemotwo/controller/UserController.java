package com.dkitaw.springdemotwo.controller;

import java.util.List;

import com.dkitaw.springdemotwo.model.Users;
import com.dkitaw.springdemotwo.repository.UserJpaRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {

  private UserJpaRepository userJpaRepository;

  private UserController(UserJpaRepository userJpaRepository) {
    this.userJpaRepository = userJpaRepository;
  }

  @GetMapping(value = "/all")
  public List<Users> findAll() {
    return userJpaRepository.findAll();
  }

  @GetMapping(value="/{name}")
  public Users findByName(@PathVariable final String name){
    return userJpaRepository.findByName(name);
  }

  @PostMapping(value="/load")
  public Users load(@RequestBody final Users users){
    userJpaRepository.save(users);
    return userJpaRepository.findByName(users.getName());
  }
//   @GetMapping(value="/update/{name}")
//   public List<UsersContact>update(@PathVariable final String name){
    
//     Users users = new Users();
//     users.setTeamName("Development").setSalary(1000).setName("frelance");
//     users.setTeamName("Nursing").setSalary(100).setName("Homecare");
//     UsersContactRepository.save(user)
// return UsersContactRepository.findAll();
//   }
}