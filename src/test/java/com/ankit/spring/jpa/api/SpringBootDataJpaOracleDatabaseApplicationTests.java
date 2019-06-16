package com.ankit.spring.jpa.api;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ankit.spring.jpa.api.model.Users;
import com.ankit.spring.jpa.api.repository.UsersRepository;
import com.ankit.spring.jpa.api.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDataJpaOracleDatabaseApplicationTests {
	@Autowired
	private UserService userService;
	@MockBean
	private UsersRepository userRepository;

	@Test
	public void fetchAllUserTest() {
		when(userRepository.findAll()).thenReturn(
				Stream.of(new Users(1L, "ankit", 100.0), new Users(1L, "ankit", 100.0)).collect(Collectors.toList()));
		assertEquals(2, userService.fetchAllUser().size());
	}

	@Test
	public void saveUserTest() {
		Users users = new Users(1L,"ankit",100.0);
		userService.saveUser(users);
		verify(userRepository,times(1)).save(users);

	}

}
