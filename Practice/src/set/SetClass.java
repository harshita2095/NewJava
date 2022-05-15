package set;

import java.util.HashSet;
import java.util.Set;

public class SetClass {
	public static void main(String[] args) {
		Set<EmployeeSet> setEmp = new HashSet<>();
		
		setEmp.add(new EmployeeSet(101, "Havi"));
		setEmp.add(new EmployeeSet(101, "Haviz"));
		setEmp.add(new EmployeeSet(102, "Khushi"));
		setEmp.add(new EmployeeSet(103, "Mum"));
		setEmp.add(new EmployeeSet(104, "Dad"));
		
		for(EmployeeSet e : setEmp) {
			System.out.println(e.getId()+ " "+e.getName());
		}
		
		
		
	}

}
