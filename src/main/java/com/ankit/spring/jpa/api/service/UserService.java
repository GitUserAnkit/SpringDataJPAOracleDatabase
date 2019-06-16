package com.ankit.spring.jpa.api.service;

import java.util.List;

import com.ankit.spring.jpa.api.model.Users;

public interface UserService {

	List<Users> fetchAllUser();

	void saveUser(Users users);

}
