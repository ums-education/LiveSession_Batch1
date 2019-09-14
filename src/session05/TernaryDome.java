package session05;

public class TernaryDome {

	public static void main(String[] args) {
		
		String healthySnack;
		
		int applesLeft = 0;
		
//		if ( applesLeft > 0 ) {
//			healthySnack = "Apple.";
//		} else {
//			healthySnack = "Chips.";
//		}
		
		healthySnack = (applesLeft > 0) ? "Apple." : "Chips.";
		
		System.out.println("What am I having for a snack? " + healthySnack);
		
		int time = 8;
		
		String classStatus = (time >= 9) 
								? "class is over" 
								: "class is still ongoing";
		
		
		
		System.out.println( classStatus );
		
	}
	
}
