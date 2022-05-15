package staticexaples;

public class StaticTest {
	static int x = 10;
	static int y;
	
	static {
		System.out.println("Static block : ");
		y = x+5;
	}
	
	
	 static void func(int z) {
		 x = 20;
		 y += 50;
		System.out.println("x : "+x);
		System.out.println("y : "+y);		System.out.println("z : "+z);
	}
	 
	 public int getX() {
		 x = 100;
		 return x;
	 }
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
//		st.func(8);
		func(8);
	}

}
