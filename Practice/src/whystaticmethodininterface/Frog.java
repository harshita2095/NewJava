package whystaticmethodininterface;

public class Frog implements AquaticAnimal {
	
	//if static
	public void livesIn() {
		System.out.println("hello");
		AquaticAnimal.livesIn();
	}
	public void canSwim() {
		System.out.println("hiiii");
		AquaticAnimal.super.canSwim();
		
	}

}
