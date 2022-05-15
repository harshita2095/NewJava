package execptions;

public class Runnable01 {
	
	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println("Execute Run Method");
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
