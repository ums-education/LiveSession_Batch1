package session05;

import java.util.Scanner;

public class OverviewDay5 {
	
	public static void main(String[] args) {
		
		boolean isGreat = (5 > 33 & 3 > 5 & 0 > -1);
		
		boolean isFalse = !true;
		
		// double ampersand and double pipes are SHORT CIRCUIT OPERATORS
		// if the left hand side of && is false, the right hand side is NOT CHECKED, false is returned
		// if the left hand side of || is true, the right hand side is NOT CHECKED, true is returned
			
//		System.out.println( isGreat );
//		System.out.println( isFalse );
		
		boolean isRedLightOn = false;
		boolean isGreenLightOn = !(isRedLightOn);
		boolean isYellowLightOn = false;
		
		// what I think when I drive a car
		if ( isRedLightOn ) {
			System.out.println("Stopping my car on a red light.");
		} else if ( isYellowLightOn ) {
			System.out.println("I am breaking for the yellow light.");
		} else {
			System.out.println("Driving through the green light.");
		}
		
		/*
		 * if it is 7 pm EST
		 * 	
		 * 	if everyone is in the class
		 * 		then we will start
		 * 	else
		 * 		we will call others to join the class
		 * else 
		 * 	the class is not starting yet
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Is it 7? (please input Y for yes, N for no ");
		
		char userInput = scan.next().charAt(0);
		
		boolean is7pm;
		
		if (userInput == 'Y') {
			is7pm = true;
		} else if (userInput == 'N') {
			is7pm = false;
		} else {
			return;
		}
		
		boolean isEveryoneHere = true;
		int hour = 6;
		
		if ( is7pm ) {
			
			// additional conditions before starting the class
			if ( isEveryoneHere ) {
				System.out.println("It is 7 and everyone is here. Let's start!");
			} else {
				System.out.println("Calling students who are not in the class and starting in 5 minutes.");
			}
						
		} else {
			if ( hour < 7 ) {
				System.out.println("It is early for the class to start.");
			} else {
				System.out.println("The class is already finished.");
			}
			
		}
		
		
		
	}
	
	
}
