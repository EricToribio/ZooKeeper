package ZooKeeper;

public class TestGorilla {

	public static void main(String[] args) {
		Gorilla DK = new Gorilla();
		
		DK.throwSomething();
		DK.throwSomething();
		DK.throwSomething();
		
		DK.eatBananas();
		DK.eatBananas();
		
		DK.climb();
		
		System.out.println(DK.getEnergyLevel());

	}

}