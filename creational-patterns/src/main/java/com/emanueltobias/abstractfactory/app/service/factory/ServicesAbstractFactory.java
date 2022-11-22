package com.emanueltobias.abstractfactory.app.service.factory;

import com.emanueltobias.abstractfactory.app.service.services.CarService;
import com.emanueltobias.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
