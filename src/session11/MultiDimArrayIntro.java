package session11;

import java.util.Arrays;

public class MultiDimArrayIntro {

	public static void main(String[] args) {
		
		String[][] countries = { 
				                {"Canada", "Vancouver", "Calgary", "Edmonton"},		// element 1
				                {"The USA", "New York City", "Los Angeles", "Chicago", "Houston", "Phoenix"},   // element 2
				                {"Mexico", "Mexico City", "Ecatepec", "Guadalajara", "Puebla", "Tijuana"}		// element 3
				               };
		
		System.out.println( Arrays.deepToString( countries ) );
		System.out.println( Arrays.toString(countries) );
		
//		arrays:
//		for (int i = 0; i < countries.length; i++) {
//			
//			singleArray:
////			String[] thisCountry = countries[i];
//			for (int j = 0; j < countries[i].length; j++) {
////				System.out.print( thisCountry[j] + " ");
//				System.out.print( countries[i][j] + " ");				
//			}
//			
//			System.out.println("\n");
//		}
		
		for (String[] country : countries) {
			
			for (String city : country) {
				System.out.print(city + " ");
			}
			
			System.out.println();
		}
		
		
		
	}
	
}
