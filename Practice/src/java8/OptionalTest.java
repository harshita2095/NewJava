package java8;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		String book =null;
		//String book = null;
		Optional<String> ofNullable = Optional.ofNullable(book);
		if(ofNullable.isPresent()) {
			System.out.println(ofNullable.get());
			System.out.println(ofNullable.orElse("hello"));
		} else {
			throw new NullPointerException();
		}
		
	}
	
	

}
