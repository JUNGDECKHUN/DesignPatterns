package programming.practice.decorator;

public class Milk extends CondimentDecorator {
	
	public Milk(Beverage beverage) {
		super(beverage);
		this.description = ", 우유 추가";
	}

	@Override
	public String getDescriSption() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + this.description;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + 1.5;
	}

}
