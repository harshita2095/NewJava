package execptions;

import java.sql.SQLException;

public class InvalidAgeExceptionTestClass {
	public static void validate(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("Age is less than 18");
		} else {
			System.out.println("Welcome to VOTE.");
		}
	}
	
	//checked exception with throw needs to be handled
	//checked exception with throws means the method won't handle it, the caller will handle it
	public static void validate2(int age) throws SQLException{
		if(age < 18) {
			throw new SQLException("Age is less than 18");
		} else {
			System.out.println("Welcome to VOTE.");
		}
	}
	
//	public static void main(String[] args) {
//		try {
//			validate(19);
//		}
//		catch(InvalidAgeException e) {
//			System.out.println("Caught Exception : "+e);
//		}
	
	public static void main(String[] args) throws InvalidAgeException{
		validate(19);
		try {
			validate2(13);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * public static void main(String[] args) throws InvalidAgeException{
	 *     
	 *        validate(19); 
	 * }
	 * 
	 */

}
