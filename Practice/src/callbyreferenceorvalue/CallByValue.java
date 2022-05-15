package callbyreferenceorvalue;

public class CallByValue {
	
	int data = 50;
	
	void change(int data) {
		data+=100;
	}
	
	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		System.out.println("before change : "+ cbv.data);
		cbv.change(500);
		System.out.println("After change : "+cbv.data);
	}

}
