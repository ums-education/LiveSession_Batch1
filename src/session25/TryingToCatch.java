package session25;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class TryingToCatch {
	public static void main(String[] args) {
		
		try {
			
			String test = "Test";
			System.out.println( test.charAt(0) );
			
			//TODO
			// add the division printout below to a nested try-catch inside this try block
			
			// something: dividing
			System.out.println( 10 / 2 ); //I'm going to throw an ArithmeticException right away
										  // this is basically similar to break statement
			
			FileReader reader = new FileReader("sample.file");
			
		} 
//		catch (FileNotFoundException fnf){
//			fnf.printStackTrace();
//		}
		catch (IOException io) {
			io.printStackTrace();
		}
		catch ( ArithmeticException | StringIndexOutOfBoundsException iob) {
			
			if (iob instanceof ArithmeticException) {
				System.out.println( "I caught an Arithmetic Exception" );
			} else {
				System.out.println( "Caught StringIndexOOB Exception" );
			}
			
			// do something about the caught Exception
			// aka the condition has become true, what are you going to do about it
			
		} 
		
//		catch ( StringIndexOutOfBoundsException siobe ) {
//			System.out.println( "Caught StringIndexOOB Exception" );
//		}
//		catch (RuntimeException e) {
//			e.printStackTrace();
//			System.out.println("Caught some child of RuntimeException aka Unchecked Exception");
//		} 
		finally {
			System.out.println("This is the finally block printout.");
		}
		
		System.out.println("continuing to run");
		
	}
}
