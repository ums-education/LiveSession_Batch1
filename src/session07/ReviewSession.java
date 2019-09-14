package session07;

public class ReviewSession {

	public static void main(String[] args) {
		/*
		 * HOW TO DEFINE TEST VALUES Use the following 5 test values where applicable.
		 * They should meet most of the test conditions: 
		 * 1. Happy path / Happy pass / Positive value 
		 * 2. Negative value / Negative scenarios 
		 * 3. Boundary testing 
		 * 4. Inner range testing 
		 * 5. Outer range testing
		 */
		// test values: 1 -> false; 2 -> true; 't' -> break; "6" -> break
//		System.out.println(isEven('t')); // FAIL

		// test values for obviousNumbers
		/* 65, -65
		 * 1000432, -2949506
		 * -0.67, 0.98
		 * 1, 0, 1000000, -1, -1000000
		 * "65", 't' -> defect/bug
		 */
		obviousNumbers(.98);
	}

	/**
	 * you are given a String variable called 'sign' and an int variable called
	 * 'number'.
	 * 
	 * If the 'number' is positive, the 'sign' should have a value "Positive", if
	 * the 'number' is negative, the 'sign' should be "Negative", and if the
	 * 'number' is equal to 0, the 'sign' should be "Zero"
	 */
	public static void assignment1(int number) {

		System.out.println((number > 0) ? "positive" : ((number < 0) ? "negative" : "zero"));

	}

	/**
	 * you are given an int variable called 'number' and a boolean variable called
	 * 'isEven'.
	 * 
	 * If the 'number' is even, the 'isEven' should be 'true', else it should be
	 * 'false'
	 */
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	/**
	 * obviousNumbers method that accepts a double as a parameter and 
	 * 	prints "zero" if the number is zero. Otherwise, 
	 *  prints "positive" or "negative". The method also 
	 *  adds "small" if the absolute value of the number is less than 1, or
	 *  "large" if it exceeds 1,000,000 
	 *  (e.g. an input of 25 would print 'positive';
	 *     an input of -0.45 would print 'negative small'; 
	 *     an input of -1234567 would print 'negative large'; 
	 *     an input of 2345678 would print 'positive large' etc.)
	 */
	public static void obviousNumbers(double number) {
		String toPrint = signOfANumber(number);
		// FUNWORK: combine the above declaration with below assignment using ternary
//		if (number > 0) {
//			toPrint = "positive";
//		} else if (number < 0) {
//			toPrint = "negative";
//		} else {
//			toPrint = "zero";
//		}
		
		
		if (Math.abs(number) < 1) {
			toPrint += " small"; // toPrint = toPrint + " small";
		} else if (Math.abs(number) > 1_000_000) {
			toPrint += " large";
		}
		
		System.out.println( toPrint );
	}
	
	public static String signOfANumber(double number) {
		if (number > 0) {
			return "positive";
		} else if (number < 0) {
			return "negative";
		} else {
			return "zero";
		}
	}
	
	
	
	
	//	public static void obviousNumbers(double number) {
//		if (number == 0) {
//			System.out.println("Zero");
//			
//		} else if (number >= 1) {
//			
//			System.out.print("Positive");
//			
//			if (number > 1000000) {
//				System.out.println(" large");
//			} 
//			
//		} else {
//			if (number < 0) {
//				String toPrint = "Negative small";
//				if (number < -1000000) {
//					toPrint = "Negative large";
//				} 
//				System.out.println( toPrint );
//			}
//		}
//	}

}
