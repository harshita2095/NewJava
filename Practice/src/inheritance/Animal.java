package inheritance;

public class Animal {
	
	public Animal() {
		System.out.println("Animal Constructor");
	}
	
	void sound() {
		System.out.println("Animal sound : ");
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal animal2 = new Cat();
		animal.sound();
		animal2.sound();
		
	}

}

class Cat extends Animal{
	
	public Cat() {
		System.out.println("Cat Constructor");
	}
	
	@Override
	public void sound() {
		System.out.println("Meow");
	}
}
