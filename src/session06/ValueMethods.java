package session06;

public class ValueMethods {

	public static void main(String[] args) {
		// test values: it is red (true), it is not red (false)

		int small = Math.min(3, 5); // this methods RETURNS A VALUE which we need to assign to a variable
									// or we need to do something with this return
		double smallD = Math.min(3.0, 5.0);
		// System.out.println(smallD);
		// System.out.println("small number: " + small);
		// System.out.println( "Absolute value of -11: " + Math.abs(-11) );

//		boolean isRedFlag = isRed("red");
		
		int secondsToGreen = redLightCountdown( isRed("red") );
		System.out.println((secondsToGreen < 0) 
							? "We are inside red light"
							: "We have " + secondsToGreen + " seconds left to green light");
		
		
		System.out.println( redLightCountdown(10) );

		
	}
	
	
	public static boolean isRed (String color) {
		if ( color.equals("red") ) {
			return true;
		} 
		
		return false;
	}
	
	

	public static int redLightCountdown(boolean isRed) {

//		if (isRed) {
//			return -1;
//		}
//
//		return 5;

		return isRed ? -1 : 5;
		
	}
	
	public static String redLightCountdown(int seconds) {
		return "There are " + seconds + " seconds left for the red light to turn on...";
	}
	
	public static String redLightCountdown(long seconds) {
		
		
		
		return "";
	}

}
