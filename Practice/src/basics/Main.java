package basics;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(1,"Ram", 20, "Male", "Automation", 1995, 5000.00);
		
		System.out.println(e1);
		
		Student student1 = new Student(1, Arrays.asList(
				new Address(111, "Bikaner"),
				new Address(112, "Delhi"),
				new Address(113, "Mumbai")
				));
		
	}
}
