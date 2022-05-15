package singleton;

import java.io.Serializable;

public class CustomSingleton implements Serializable, Cloneable{
	
	private static CustomSingleton customSingleton;
	
	private CustomSingleton() {}
	
	public static CustomSingleton getOneInstance() {
		if(customSingleton == null) {
			synchronized(CustomSingleton.class) {
				if(customSingleton == null) {
					customSingleton = new CustomSingleton();
				}
			}
		}
		 return customSingleton;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();	}

}
