package execptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UncheckExceptions01 {
	
	public static void Exception01(int x, String s ) {
		x = x/0;
		System.out.println("x : " +x);
		System.out.println("s.toUpperCase() : " + s.toUpperCase());
	}
	
	public static void main(String[] args) throws IllegalArgumentException, NullPointerException, ArithmeticException {
		//Exception01(10, null); // will give error in console
		//To avoid that, write the code in the try catch block like below
		
		try {
			Exception01(10, null);
		}
		catch(IllegalArgumentException | NullPointerException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			FileInputStream fis = new FileInputStream("test.txt");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
