package com.reidconner.contractproducer.controllers;

import com.reidconner.contractproducer.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

	@GetMapping("/users")
	public List<User> getUsers() {
		return Arrays.asList(
				new User("1", "Joe")
		);
	}

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable String id) {
		return new User(id, "Joe");
	}

}
