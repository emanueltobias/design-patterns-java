package com.emanueltobias.factory.apple.simple.factory;

import com.emanueltobias.factory.apple.simple.model.IPhone;
import com.emanueltobias.factory.apple.simple.model.IPhone11;
import com.emanueltobias.factory.apple.simple.model.IPhone11Pro;
import com.emanueltobias.factory.apple.simple.model.IPhoneX;
import com.emanueltobias.factory.apple.simple.model.IPhoneXSMax;

public class IPhoneSimpleFactory {

	public static IPhone orderIPhone(String generation, String level) {
		IPhone device = null;

		if (generation.equals("X")) {
			if (level.equals("standard")) {
				device = new IPhoneX();
			} else if (level.equals("highEnd")) {
				device = new IPhoneXSMax();
			}
		} else if (generation.equals("11")) {
			if (level.equals("standard")) {
				device = new IPhone11();
			} else if (level.equals("highEnd")) {
				device = new IPhone11Pro();
			}
		}

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}
}
