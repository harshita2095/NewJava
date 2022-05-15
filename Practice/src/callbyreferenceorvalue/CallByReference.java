package callbyreferenceorvalue;

public class CallByReference {
	
	int data = 50;
	
	void change(CallByReference cbr) {
		data+=100;
	}
	
	public static void main(String[] args) {
		CallByReference cbr = new CallByReference();
		System.out.println("before change : "+cbr.data);
		cbr.change(cbr);
		System.out.println("after change : "+cbr.data);
	}

}
