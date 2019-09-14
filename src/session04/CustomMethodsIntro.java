package session04;

public class CustomMethodsIntro {

	public static void main(String[] args) {
		
		// this is optional, you don't need the class name if you are in the same class
		// CustomMethodsIntro.firstCustomPrinter();
		
		System.out.println( "first print statement inside main() ");
		emptyLine();
		firstCustomPrinter(); // calling another method, let's go and execute that
		emptyLine();
		System.out.println( "last print statement inside main() ");
		
	}
	
	
	
	public static void firstCustomPrinter() {
		System.out.println( "entering method" );
		emptyLine();
		System.out.println( "printing..." );
		emptyLine();
		System.out.println( "exiting method" );
	}
	
	public static void emptyLine() {
		System.out.println();
	}
	
	
}
