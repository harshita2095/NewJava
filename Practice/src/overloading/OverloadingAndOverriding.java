package overloading;

public class OverloadingAndOverriding {
	void print(String s) {
		System.out.println(s);
	}
	void print (String s, int count) {
		System.out.println(s + " " + count);
	}

	void print(String s, String q, int count) {
		while(count > 0) {
			System.out.println(s+" " +q);
			count--;
		}
	}
	
	public static void main(String[] args) {
		OverloadingAndOverriding ol = new OverloadingAndOverriding();
		ol.print(null);
		OverridingExampleBaseClass or1 = new OverridingExampleBaseClass();
		or1.printName();
		OverridingExampleBaseClass or2 = new OverridingExampleChildClass();
		or2.printName();
		
	}
}

class OverridingExampleBaseClass{
	void printName() {
		System.out.println("Base Class.");
	}
}

class OverridingExampleChildClass extends OverridingExampleBaseClass{
	@Override
	void printName() {
		System.out.println("Child Class.");
	}
}
