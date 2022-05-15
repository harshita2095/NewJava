package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import streams.Employee;

public class Main {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Khushi", 20));
		empList.add(new Employee("Havi", 25));
		empList.add(new Employee("Shyam", 10));
		empList.add(new Employee("Shyam", 10));
		
		empList
		.stream()
		.collect(Collectors.groupingBy( e -> e.getName(), Collectors.counting()))
		.forEach((k,v) -> System.out.println(k+" "+v));
		
		
	}
}
