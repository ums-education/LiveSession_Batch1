package session10;

import java.util.Arrays;

public class ArraysIntro {
	public static void main(String[] args) {
		
		String[] packages = new String[12];
		
		for (int i = 0; i < packages.length; i++) {
			
			packages[i] = "session" + (i + 1);
			
		}
		
		String[] copy = Arrays.copyOf(packages, packages.length); 
				
		Arrays.sort( copy );
//		testSort( packages );
		
		System.out.println( Arrays.toString( packages ) );
		System.out.println( Arrays.toString( copy ) );
		
//		System.out.println( Arrays.binarySearch(copy, "session121") );
		
//		System.out.println( "hello1".equals("hello2") );
		
		System.out.println( Arrays.equals(copy, packages) );
		
		
	}
	
	public static void testSort(String[] toSort) {
		String[] localArray = Arrays.copyOf(toSort, toSort.length);
		Arrays.sort( localArray );
	}
	
}
