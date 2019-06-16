package com.ankit.spring.jpa.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankit.spring.jpa.api.model.Users;
import com.ankit.spring.jpa.api.repository.UsersRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UsersRepository userRepository;

	@Override
	public List<Users> fetchAllUser() {
		return userRepository.findAll();
	}

	@Override
	public void saveUser(Users users) {
		userRepository.save(users);

	}

}
