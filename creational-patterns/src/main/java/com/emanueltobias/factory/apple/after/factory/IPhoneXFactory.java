package com.emanueltobias.factory.apple.after.factory;

import com.emanueltobias.factory.apple.after.model.IPhone;
import com.emanueltobias.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
