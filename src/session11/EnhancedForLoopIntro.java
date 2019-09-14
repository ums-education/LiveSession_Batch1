package session11;

public class EnhancedForLoopIntro {
	
	public static void main(String[] args) {
		
		String[] cities = {"New York City", "Los Angeles", "Chicago", "Houston", "Phoenix"};
		
//		for (int i = 0; i < usa.length; i++) {
//			System.out.println( usa[i] );
//		}
		
		for (String city : cities) {
			System.out.println(city);
		}
		
		
		int[] values = {5, 3, 7, 100, 0};
		
		for (int value : values) {
			System.out.println(value);
			
		}
		
	}

}
