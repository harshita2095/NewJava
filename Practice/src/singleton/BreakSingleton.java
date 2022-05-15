package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import singleton.CustomSingleton;


public class BreakSingleton {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException  {
		CustomSingleton originalCS = CustomSingleton.getOneInstance();
		CustomSingleton duplicateCS = CustomSingleton.getOneInstance();
		System.out.println("originalCS : "+ originalCS.hashCode());
		System.out.println("duplicateCS : "+ duplicateCS.hashCode());
		
		//breaking through serialization
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/harshitasingh/Downloads/serialization.txt"));
		objectOutputStream.writeObject(originalCS);
		objectOutputStream.close();
		
		//deserialization
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/harshitasingh/Downloads/serialization.txt"));
		CustomSingleton ser = (CustomSingleton)objectInputStream.readObject();
		System.out.println("originialCS : "+ originalCS.hashCode());
		System.out.println("ser : "+ ser.hashCode());
		
		//clone
		CustomSingleton cloneCS = (CustomSingleton) originalCS.clone();
	}

}
