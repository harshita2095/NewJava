package interfaceexamples;

public class Test implements InterfaceWithStaticAndDefault {
	
	@Override
	public void method01(String str) {
		System.out.println("str : "+str);
		
	}
	
	public static void main(String[] args) {
		InterfaceWithStaticAndDefault ir = new Test();
		ir.method01(""); //regular method
		ir.log("log "); // default
		System.out.println(InterfaceWithStaticAndDefault.isNull(null)); //static
		System.out.println(InterfaceWithStaticAndDefault.isNull("hello")); //static
	}

}
