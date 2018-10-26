package com.dkitaw.springdemotwo.repository;

import com.dkitaw.springdemotwo.model.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public  interface UserJpaRepository extends JpaRepository<Users, Long> {

	Users findByName(String name);

}