package programming.practice.PlantsVSZombie;

public class PlantList {
	public Plant BuyPlant(String plantName) {
		Plant plant = SimplePlantFactory.createPlant(plantName);
		
		if(plant == null) {
			return null;
		}
		
		plant.Buy();
		plant.Install();
		plant.Attack();
		
		return plant;
	}

}
