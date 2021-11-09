package programming.practice.decorator;

public class Espresso extends Beverage {
	
	public Espresso() {
		this.description = "에스프레소";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		//return super.cost() +2.5;
		return 2.5;
	}

}
