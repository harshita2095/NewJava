package set;

public class EmployeeSet {
	
	private int id;
    private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public EmployeeSet(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	/*
	//for String name
	@Override
	public int hashCode() {
		final int prime=31;
		int result = 1;
		result = prime * result + ((name==null) ? 0 : name.hashCode());
		System.out.println(name.hashCode());
		return result;
	}
	*/
	
	//for int id
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == 0) ? 0 : Integer.valueOf(id).hashCode());
		System.out.println(Integer.valueOf(id).hashCode());
		return result;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		
		//typecasting of the argument
		EmployeeSet emp = (EmployeeSet) obj;
		
		//comparing the state of argument with state of 'this' object
		if(name == null) {
			if(emp.name != null) {
				return false;
			} else if(!name.equals(emp.name)) {
				return false;
			}
			if(id != emp.id) {
				return false;
			}
		}
		return true;
	}
	
	

}

