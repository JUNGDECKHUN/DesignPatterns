package programming.practice.strategy;

import programming.practice.strategy.behavior.FlyNoway;
import programming.practice.strategy.behavior.MuteQuack;
import programming.practice.strategy.behavior.FloatOnwater;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		this.quackable = new MuteQuack();
		this.swimable = new FloatOnwater();
		this.flyable = new FlyNoway();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("나는 가짜오리");
		
	}
}
