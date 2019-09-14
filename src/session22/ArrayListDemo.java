package session22;

import java.util.*;

import session19.Circle;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList test1 = new ArrayList();
		test1.add("John");
		test1.add("Doe");
		test1.add("Jane");
		test1.remove("Doe");
		test1.add( 1 ); // 1 is NOT an int here, it is an Integer object
		test1.add( '&' ); // NOT a char, it is a Character object
		test1.add( new Circle() );
		
		
		ArrayList toInsert = new ArrayList();
		toInsert.add("Test object");
		toInsert.add("flying object");
		toInsert.add("UFO");
		
		test1.addAll(toInsert);
		
		System.out.println(test1);
		
		System.out.println( test1.get(6) );
		System.out.println( test1.size() );
		
	}
}
