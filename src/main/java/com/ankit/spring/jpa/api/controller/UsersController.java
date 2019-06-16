package com.ankit.spring.jpa.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.spring.jpa.api.model.Users;
import com.ankit.spring.jpa.api.service.UserService;

@RestController
@RequestMapping("/user")
public class UsersController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/allUser")
	public List<Users> getAllUser(){
		return userService.fetchAllUser();
	}
	
	@PostMapping("/loadUser")
	public String loadUser(@RequestBody Users users){
		userService.saveUser(users);
		return "User save "+users.getUserName();
	}

}
