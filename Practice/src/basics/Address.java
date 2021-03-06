package basics;

public class Address {
	
	private int houseNo;
	private String city;
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + "]";
	}
	public Address(int houseNo, String city) {
		super();
		this.houseNo = houseNo;
		this.city = city;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
