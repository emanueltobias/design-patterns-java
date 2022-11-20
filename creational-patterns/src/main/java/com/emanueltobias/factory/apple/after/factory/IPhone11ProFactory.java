package com.emanueltobias.factory.apple.after.factory;

import com.emanueltobias.factory.apple.after.model.IPhone;
import com.emanueltobias.factory.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
