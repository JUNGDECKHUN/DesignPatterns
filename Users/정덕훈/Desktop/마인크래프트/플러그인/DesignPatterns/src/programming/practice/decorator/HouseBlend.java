package programming.practice.decorator;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		this.description = "하우스블렌드";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		//return super.cost() + 2.0;
		return 2.0;
	}

}
