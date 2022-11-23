package com.emanueltobias.abstractfactory.apple;

import com.emanueltobias.abstractfactory.apple.factory.IPhone11Factory;
import com.emanueltobias.abstractfactory.apple.factory.IPhoneFactory;
import com.emanueltobias.abstractfactory.apple.factory.IPhoneXFactory;
import com.emanueltobias.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import com.emanueltobias.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import com.emanueltobias.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
