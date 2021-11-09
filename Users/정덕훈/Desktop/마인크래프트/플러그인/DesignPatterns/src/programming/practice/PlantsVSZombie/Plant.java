package programming.practice.PlantsVSZombie;

public abstract class Plant {
	
	public void Buy() {
		System.out.println("구매");
		
	}
	public void Install() {
		System.out.println("설치");
		
	}
	public void Attack() {
		System.out.println("공격");
		
	}
	
	public abstract void display();


}
