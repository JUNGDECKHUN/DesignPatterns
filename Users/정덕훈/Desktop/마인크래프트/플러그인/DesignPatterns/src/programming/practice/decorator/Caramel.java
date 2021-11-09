package programming.practice.decorator;

public class Caramel extends CondimentDecorator {

	public Caramel(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
		this.description = ", 초콜릿 추가";
	}

	@Override
	public String getDescriSption() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + this.description;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + 0.9;
	}

}
