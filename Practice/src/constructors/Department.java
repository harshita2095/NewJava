package constructors;

public class Department {
	
	private int deptId;
	private String deptName;
	
	public Department() {
		
	}
	public Department( int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName= deptName;
	}
	public Department(int deptId) {
		this.deptId = deptId;
	}
	
	public static int getNewDepartmentID(int deptId) {
		deptId = 222000+deptId; 
		return deptId; 
	}

}
