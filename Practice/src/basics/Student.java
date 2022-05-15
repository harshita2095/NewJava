package basics;

import java.util.List;

public class Student {
	
	private int id;
	private List<Address> listOfAddress;
	public Student(int id, List<Address> listOfAddress) {
		super();
		this.id = id;
		this.listOfAddress = listOfAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Address> getListOfAddress() {
		return listOfAddress;
	}
	public void setListOfAddress(List<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", listOfAddress=" + listOfAddress + "]";
	}

}
