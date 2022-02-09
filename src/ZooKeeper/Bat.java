package ZooKeeper;

public class Bat extends Mammal{

	public Bat() {
		super();
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Sound of bat wings flapping");
		this.setEnergyLevel(getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		this.setEnergyLevel(getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("Burn Crackle POP");
		this.setEnergyLevel(getEnergyLevel() - 100);
	}

}
