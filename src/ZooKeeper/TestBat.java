package ZooKeeper;

public class TestBat {

	public static void main(String[] args) {
		
		Bat Dracula = new Bat();
		
		Dracula.attackTown();
		Dracula.attackTown();
		Dracula.attackTown();
		
		Dracula.eatHumans();
		Dracula.eatHumans();
		
		Dracula.fly();
		Dracula.fly();
		
		System.out.println(Dracula.getEnergyLevel());
	}

}
