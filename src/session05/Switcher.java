package session05;

public class Switcher {

	public static void main(String[] args) {

		// 1st, 2nd, 3rd, 4th, 5th, 11, 12, 13, 21st, 22nd, 23rd

		int number = -11;
		String suffix;

		// switch for the remainder of the number%10
		// basically, check for the LAST digit of the number
		switch ( Math.abs( number ) ) {
		
			case 11:
			case 12:
			case 13: suffix = "th"; 
				break;
				
			case 1:	suffix = "st";	break;
	
			case 2: suffix = "nd";	break;
				
			case 3: suffix = "rd";	break;
				
			default: suffix = "th";	break;

		}
		
		
//		switch ( number % 10 ) {
//
//			case 1:
//				suffix = "st";
//	
//				if (number == 11) {
//					suffix = "th";
//				}
//				break;
//	
//			case 2: suffix = "nd";
//				if (number == 12) {
//					suffix = "th";
//				}
//				break;
//				
//			case 3: suffix = "rd";
//				if (number == 13) {
//					suffix = "th";
//				}
//				break;
//				
//			default: suffix = "th";	break;
//
//		}

		System.out.println(number + suffix);

	}

}
/*
 * 2012 % 10 = 2 2 % 10 = 2
 * 
 * 
 */
