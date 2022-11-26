package com.emanueltobias.bridge.backend.services;

import com.emanueltobias.bridge.backend.dao.UserDao;
import com.emanueltobias.bridge.backend.model.User;

public class UserEJB extends UserService {

	public UserEJB(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
		dao.save(user);
	}
}
