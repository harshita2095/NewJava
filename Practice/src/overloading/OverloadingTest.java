package overloading;

public class OverloadingTest {
	
	public static void test(int a, int b) {
		System.out.println("in int datatype");
	}
	
	public static void test(long a, long b) {
		System.out.println("in long datatype");
	}
	
	public static void test3(double a, double b) {
		System.out.println("in double datatype");
	}
	
	public static void test3(float a, float b) {
		System.out.println("in float datatype");
	}
	
	public static void test2(String s) {
		System.out.println("in String wrapper class");
	}
	
	public static void test2(Object o) {
		System.out.println("in Object class");
	}
	
	public static void main(String[] args) {
		test(1,1);
		test2(null);
		test3(2.2,2.2);
	}
	
	

}
