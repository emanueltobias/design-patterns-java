package com.emanueltobias.abstractfactory.app.service.factory;

import com.emanueltobias.abstractfactory.app.service.services.CarRestApiService;
import com.emanueltobias.abstractfactory.app.service.services.CarService;
import com.emanueltobias.abstractfactory.app.service.services.UserRestApiService;
import com.emanueltobias.abstractfactory.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
