package session08;

public class Demo {

	public static void main(String[] args) {
//		System.out.println(  );
		
//		System.out.println( bottleOfBeer( (byte) (0) ) );
		
		System.out.println( sample(2) );
		
		reader( 999 );
	}

	/*
	 * 
	 *  2 bottles of beer on the wall,
		2 bottles of beer,
		ya’ take one down, ya’ pass it around,
		1 bottles of beer on the wall.
	 * 
	 * 	1 bottles of beer on the wall,
		1 bottles of beer,
		ya’ take one down, ya’ pass it around,
		no bottles of beer on the wall.
	 * 
	 * 	No bottles of beer on the wall,
		no bottles of beer,
		ya’ take one down, ya’ can't pass it around,
		'cause there are no more bottles of beer on the wall!
	 */
	
	public static void bottleOfBeer(int x) {
		if (x == 0) {
			System.out.println("No bottles of beer on the wall");
			System.out.println("no bottles of beer,");
			System.out.println(
					"ya take one down, ya can't pass it around,\ncause there are no more bottles of beer on the wall!");
		} else {
		
			System.out.println(x + " bottles of beer on the wall");
			System.out.println(x + "bottles of beer,");
			System.out.println("ya’ take one down, ya’ pass it around,");
			System.out.println((x - 1) + "bottles of beer on the wall\n");
			
			bottleOfBeer(x - 1);
		}
		
	}
	
	
	
	
	
	
	
	/* TASK
	 * 
	 * Create a program for a navigation device
	 * Your program is going to work with voicing numbers only (read the numbers out loud)
	 * There are 5 teams working on different functionalities
	 * 
	 * Given a number that can be a distance from 0 to 1000 yards
	 * Your program will need to read out the distance at any requested time.
	 * E.g.: user requests you to read out the distance when it is 956 yards;
	 * 	 	 your program prints out -> nine hundred fifty six yards
	 * E.g.: user requests you to read out the distance when it is 19 yards;
	 * 		 your program prints out -> nineteen yards
	 * 
	 * 
	 * Test values: 9, 18, 92, 699, 125, 311, 507
	 */
	
	
	
	
	
	
	
	
	
	
	public static void reader(int x) {
		if (x == 956) {
			System.out.println("nine hundred fifty six");
		}
	}
	
	public static String bottleOfBeer( byte x ) {
		
		if ( x == 0 ) {
			String verseLast = "No bottles of beer on the wall\n"
						 + "No bottles of beer,\n"
						 + "ya take one down, ya can't pass it around,\n"
						 + "cause there are no more bottles of beer on the wall!\n\n";
			return verseLast;
		} else {
			String verse = x + " bottles of beer on the wall\n"
					 	 + x + " bottles of beer,\n"
					 	 + "ya take one down, ya can't pass it around,\n"
					 	 + (x-1) + " bottles of beer on the wall!\n\n";
					
			
			return verse + bottleOfBeer( (byte)(x - 1) );
			
		}
		
	}
	
	public static String sample( int y ) {
		
		if (y == 0) {
			return " " + "zero";
		} else {
			return " " + y + sample( y - 1);
		}
		
		
	}

}
