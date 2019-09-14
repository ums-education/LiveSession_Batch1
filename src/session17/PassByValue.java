package session17;

import java.util.Arrays;

public class PassByValue {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println( Arrays.toString( numbers ) );
		
		justTesting( numbers );
		System.out.println( Arrays.toString( numbers ) );

		
	}
	
	private static void justTesting( int[] arr ) {
		
		int[] localArr = Arrays.copyOf(arr, arr.length);
		localArr[2] = 7;
		
		System.out.println( Arrays.toString(localArr) );
		
	}
	
}
