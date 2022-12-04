package com.emanueltobias.strategy.worker.jobs;

import com.emanueltobias.strategy.worker.strategies.eat.MeatFoodStrategy;
import com.emanueltobias.strategy.worker.strategies.transportation.AirplaneStrategy;
import com.emanueltobias.strategy.worker.strategies.work.PilotStrategy;

public class Pilot implements Worker {

	@Override
	public void eat() {
		new MeatFoodStrategy().eat();
	}

	@Override
	public void move() {
		new AirplaneStrategy().move();
	}

	@Override
	public void work() {
		new PilotStrategy().work();
	}

}
