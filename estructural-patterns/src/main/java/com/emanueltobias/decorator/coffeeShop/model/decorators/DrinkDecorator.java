package com.emanueltobias.decorator.coffeeShop.model.decorators;

import com.emanueltobias.decorator.coffeeShop.model.Drink;

public abstract class DrinkDecorator implements Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}