package session02;

public class PrintingVariables {

	public static void main(String[] args) {
		
		System.out.println( "Hello, World!" );
				
		String greeting = "Hi!" ;
		// some code that intentionally changes greeting to hold "Hello there"		
		greeting = "Hello there!";
		
		System.out.println( greeting );
		
		System.out.print("Demo of");
		System.out.println(" print statement, withouth ln");
		
		
		String text = "The time is: ";
		int hour = 3;
		int minute = 19;
		char colon = ':';
		
		System.out.print( text );
		System.out.print( hour );
		System.out.print( colon );
		System.out.println( minute );
		
		
		
	}
	
	
}
