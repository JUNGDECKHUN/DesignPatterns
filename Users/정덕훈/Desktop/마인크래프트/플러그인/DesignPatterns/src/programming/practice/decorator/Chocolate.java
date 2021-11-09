package programming.practice.decorator;

public class Chocolate extends CondimentDecorator {
	
	public Chocolate(Beverage beverage) {
		super(beverage);
		this.description = ", 초콜릿  추가";
	}
	
	@Override
	public String getDescriSption() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + this.description;
	}


	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + 1.0;
	}

	
}
