package session06;

public class PostVPreFix {
	
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		
		
		// example of a postfix
		num1++;
		System.out.println( num1++ ); //before doing anything after this statement
									  //compiler increments and reassigns for num1++ (aka, num1 += 1; aka num1 = num1 + 1)
		System.out.println( num1 );
		
		++num1; //8
		System.out.println( ++num1 ); //when compiler see a PREfix unary operator, it STOPS EVERYTHING AND SOLVES FOR IT FIRST
									  //it increments and reassigns for ++num1 (aka, num1 += 1; aka num1 = num1 + 1)
		System.out.println( num1 );
		
		// the same above applies to post and pre-decrement
		System.out.println( --num1 );
		System.out.println( num1-- );
		System.out.println( --num1 );
	}
	
}
