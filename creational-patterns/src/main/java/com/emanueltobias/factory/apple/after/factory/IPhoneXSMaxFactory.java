package com.emanueltobias.factory.apple.after.factory;

import com.emanueltobias.factory.apple.after.model.IPhone;
import com.emanueltobias.factory.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
