package programming.practice.strategy;

import programming.practice.strategy.behavior.FlyNoway;
import programming.practice.strategy.behavior.Squeak;
import programming.practice.strategy.behavior.FloatOnwater;

public class RubberDuck extends Duck {
	public RubberDuck() {
		this.quackable = new Squeak();
		this.swimable = new FloatOnwater();
		this.flyable = new FlyNoway();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("나는 고무오리야!");

	}

}
