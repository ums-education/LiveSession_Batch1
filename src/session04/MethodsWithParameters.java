package session04;

/**
 * Sample class to demonstrate creating custom parameters
 * @author Shahin Gadimov
 *
 */
public class MethodsWithParameters {

	public static void main(String[] args) {
		print( "test" );
		
		print("something");
		
		copyPrinter(4, "Application");
		
		
		int number = 5;
		String name = "John";
		
		int totalCents = 125;
		int dollar = totalCents / 100; // 1
		int quarter = totalCents - ( dollar * 100 );
		quarter =     totalCents % 100;
		
		
	}
	
	
	/**
	 * This method calls System.out.println() internally
	 * and passes its parameter value to the println()
	 * 
	 * @param x 
	 */
	public static void print( String x ) {
		String toPrint = x;
		
		System.out.println( toPrint );
		
	}
	
	/**
	 * 
	 * @param numberOfCopies
	 * @param file
	 */
	public static void copyPrinter(int numberOfCopies, String file) {
		// there is some code here that starts the copy machine
		
		// and the user gets the following message letting him/her know that the copier is working
		System.out.println("The copy machine has started making " + numberOfCopies + " copies of");
		System.out.println("the file called " + file);
	}
	
	
}
