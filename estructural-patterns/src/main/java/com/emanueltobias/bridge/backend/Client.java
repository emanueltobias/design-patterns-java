package com.emanueltobias.bridge.backend;

import com.emanueltobias.bridge.backend.dao.UserMongoDao;
import com.emanueltobias.bridge.backend.dao.UserMysqlDao;
import com.emanueltobias.bridge.backend.dao.UserOracleDao;
import com.emanueltobias.bridge.backend.dao.UserPostgresDao;
import com.emanueltobias.bridge.backend.model.User;
import com.emanueltobias.bridge.backend.services.UserEJB;
import com.emanueltobias.bridge.backend.services.UserRest;
import com.emanueltobias.bridge.backend.services.UserService;
import com.emanueltobias.bridge.backend.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);
		
		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);
		
		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);
		
		//.......
		
		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
		
	}
}
