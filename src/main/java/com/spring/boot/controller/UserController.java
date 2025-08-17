package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.dao.UserRepo;
import com.spring.boot.model.User;

@RestController
public class UserController {
	
	@Autowired
	private UserRepo dao;

	@GetMapping
	public User test() {
		System.out.println("UserController.test()");
		return new User(1, "Guest", "G12345");
	}
	
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		System.out.println("UserController.createUser()");
		dao.save(user);
		return user;
	}

}
