package interfaceexamples;

public interface InterfaceWithStaticAndDefault {
	
	//regular abstract method
	void method01(String str);
	
	
	default void log(String str) {
		System.out.println("logging : "+ str);
	}
	
	static boolean isNull(String str) {
		System.out.println("Interface Null Check : ");
		return str == null ? true : "".equals(str) ? true : false;
	}

}

