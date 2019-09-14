package session22;

import java.util.*;

import session19.Circle;

public class GenericConceptDemo {
	public static void main(String[] args) {
		
		
		ArrayList<String> genericStr = new ArrayList<String>();
		genericStr.add("John");
		genericStr.add("Doe");
		genericStr.add("Jane");
		
//		System.out.println( genericStr.toString() );
		
/*		// regular for loop
		for (int i = 0; i < genericStr.size(); i++) {
			System.out.println( genericStr.get(i) );
		}
*/		
/*		// for-each loop
		for (String each: genericStr) {
			System.out.println( each );
		}
*/
/*		// forEach() method
		genericStr.forEach(
				each -> {System.out.println(each);}
		);
*/
		
		Iterator<String> elements = genericStr.iterator();
		
		while ( elements.hasNext() ) {
			elements.next();
			elements.remove();
//			System.out.println( elements.next() );
		}
		
		System.out.println( genericStr );
	}
}
