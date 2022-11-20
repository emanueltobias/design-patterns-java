package com.emanueltobias.factory.apple.halfSimple;

import com.emanueltobias.factory.apple.halfSimple.factory.IPhone11Factory;
import com.emanueltobias.factory.apple.halfSimple.factory.IPhoneFactory;
import com.emanueltobias.factory.apple.halfSimple.factory.IPhoneXFactory;
import com.emanueltobias.factory.apple.halfSimple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
		
		System.out.println("### Ordering an iPhone X HighEnd");
		IPhone iphone3 = genXFactory.orderIPhone("highEnd");
		System.out.println(iphone3);
	}
}
