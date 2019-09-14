package session06;

import java.util.Scanner;

public class FlagMethods {

	public static void main(String[] args) {
	
//		Scanner scan = new Scanner(System.in);
		
		
		// used to check for the value of a given variable
		
		int num1 = 5;
		int num2 = 0;
		
		if ( isZero( num2 ) ) {
			System.err.println( "ERROR: Can't divide by zero" );
			System.out.println("This is to show that System.err prints out in red, NOT in black");
			return;
		}
			
		System.out.println( num1 / num2 );
		
		
		
	}
	
	
	/**
	 * Checks if the parameter value is equal to 0. 
	 * @author S. Gadimov
	 * @param num is an int value that is to be checked.
	 * @return	true if and only if the parameter is equal to 0.
	 */
	public static boolean isZero (int num) {
		return num == 0;
	}
	
	
}
