package com.emanueltobias.adapter.hexagonal.application;

import java.util.List;
import java.util.Map;

import com.emanueltobias.adapter.hexagonal.core.model.User;
import com.emanueltobias.adapter.hexagonal.core.ports.UserRepository;
import com.emanueltobias.adapter.hexagonal.core.usecases.UserService;
import com.emanueltobias.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

public class UserRest {
	private UserService userFacade;
	
	public UserRest() {
		UserRepository userRepo = new UserMemoryDatabaseAdapter();
		userFacade = new UserService(userRepo);
	}

	public Integer post(Map<String, String> values) {
		try { 
			User user = new User(values.get("name"), values.get("email"), values.get("password"));
			userFacade.saveUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 400;
		}
		return 201;
	}
	
	public Integer get() {
		List<User> users = userFacade.getUsers();
		users.stream().forEach(System.out::println);
		return 200;
	}
}
