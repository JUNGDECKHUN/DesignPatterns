package programming.practice.strategy;


import programming.practice.strategy.behavior.FlyNoway;
import programming.practice.strategy.behavior.Quack;
import programming.practice.strategy.behavior.FloatOnwater;

public class RobotDuck extends Duck {
	public RobotDuck() {
		this.quackable = new Quack();
		this.swimable = new FloatOnwater();
		this.flyable = new FlyNoway();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("오리시대의 끝이 도래했다.");
		
	}

}
