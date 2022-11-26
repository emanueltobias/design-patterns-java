package com.emanueltobias.bridge.backend.services;

import com.emanueltobias.bridge.backend.dao.UserDao;
import com.emanueltobias.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
