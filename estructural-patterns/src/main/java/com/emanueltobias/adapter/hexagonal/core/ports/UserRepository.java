package com.emanueltobias.adapter.hexagonal.core.ports;

import java.util.List;

import com.emanueltobias.adapter.hexagonal.core.model.User;

public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
