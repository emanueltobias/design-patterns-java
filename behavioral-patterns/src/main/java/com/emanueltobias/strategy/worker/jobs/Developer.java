package com.emanueltobias.strategy.worker.jobs;

import com.emanueltobias.strategy.worker.strategies.eat.MeatFoodStrategy;
import com.emanueltobias.strategy.worker.strategies.transportation.CarStrategy;
import com.emanueltobias.strategy.worker.strategies.work.DeveloperStrategy;

public class Developer implements Worker {

	@Override
	public void eat() {
		new MeatFoodStrategy().eat();
	}

	@Override
	public void move() {
		new CarStrategy().move();
	}

	@Override
	public void work() {
		new DeveloperStrategy().work();
	}

}
