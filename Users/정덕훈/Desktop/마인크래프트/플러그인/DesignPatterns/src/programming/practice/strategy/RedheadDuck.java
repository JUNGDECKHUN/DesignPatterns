package programming.practice.strategy;

import programming.practice.strategy.behavior.FlyWithWings;
import programming.practice.strategy.behavior.Quack;
import programming.practice.strategy.behavior.SwimWithLegs;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("나는 아메리카흰죽지");

	}

}
