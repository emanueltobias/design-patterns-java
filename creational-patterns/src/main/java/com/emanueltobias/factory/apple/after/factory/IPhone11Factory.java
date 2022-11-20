package com.emanueltobias.factory.apple.after.factory;

import com.emanueltobias.factory.apple.after.model.IPhone;
import com.emanueltobias.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
