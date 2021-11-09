package programming.practice.PlantsVSZombie;

public class SimplePlantFactory {
	
	public static Plant createPlant(String name) {
		Plant plant = null;
		
		if(name.equals("sunflower")) {
			plant = new Sunflower();
		} else if(name.equals("sunshroom")) {
			plant = new Sunshroom();
		} else if(name.equals("wallnut")) {
			plant = new WallNut();
		} else if(name.equals("tallnut")) {
			plant = new TallNut();
		} else if(name.equals("peashooter")) {
			plant = new Peashooter();
		} else if(name.equals("repeater")) {
			plant = new Repeater();
		}
		return plant;
	}

	

}
