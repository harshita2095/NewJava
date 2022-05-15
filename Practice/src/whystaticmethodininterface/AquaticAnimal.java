package whystaticmethodininterface;

public interface AquaticAnimal {
	
	  static public void livesIn() {
		System.out.println("Lives in water");
	}
	  default void canSwim() {
		  System.out.println("Yes can swim");
		  
	  }

}


