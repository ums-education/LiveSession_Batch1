package session02;

public class ArithmeticsOnStrings {

	public static void main(String[] args) {
		
		String firstName = "John";
		char space = ' ';
		String lastName = "Doe";
		
		// "John Doe" => "John" + " " + "Doe"
		// this is String concatenation
		// + sign is overloaded in Java to concatenate Strings
		// overloading means keeping the look the same, changing habit
		
		String fullName = "John" + " " + "Doe";
		System.out.println( fullName );
		
		System.out.println( firstName + ' ' + 55 + " " + lastName );
		// the same as      "John"      " "  "55"  " "   "Doe"
		
		System.out.println( 10 + 45 + firstName + " " + lastName);
		
		System.out.println( firstName + ( 10 + 45 ) + lastName );
		
		System.out.println( firstName + ( 10 + 45 ) + lastName );
		
		// shortkey for running Java application:   Ctrl + F11
	}
	
}
