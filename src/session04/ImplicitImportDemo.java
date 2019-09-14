package session04;

import java.util.Scanner;

public class ImplicitImportDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println();
		String test = "test";
		
		
		int total = 5 * (3 + (2-1) ) ;
		
		//                        3                2              - 1
		int similarTotal = 5 * ( Math.abs(-3) + ( Math.max(2, -1) - 1 ) ); // 20
		
		System.out.println(similarTotal);
		
		System.out.println( Math.PI );
		
	}
	
	
}
