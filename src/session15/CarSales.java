package session15;

import java.util.Arrays;

public class CarSales {
	
	public static void main(String[] args) {
		
		Car toyota = new Car(2012, "Toyota", "Camry", 12999.99, "Silver");
		System.out.println( toyota.toString() );
		
		Car lexus = new Car(2015, "Lexus", "RX300", 25495.99, "Red");
		System.out.println( lexus.toString() );
		
		Car dummy = new Car();
		System.out.println( dummy.toString() );
		
		/* 1. Static belongs a class
		 * 		We called it by class name followed by the method name
		 * 2. We did not create Arrays object
		 * 3. No matter what type of array object we pass in
		 * 		it ALWAYS DOES THE SAME THING
		 */
		Arrays.toString( new int[] {1, 2, 3} );
	}

}
