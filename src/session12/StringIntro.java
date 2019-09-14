package session12;

import java.util.Scanner;
import java.util.Arrays;

public class StringIntro {
	
	public static void main(String[] args) {
//		lengthTest();
//		indexOfTest();
//		substringTest();
//		charAtTest();
//		equalsIgnoreCaseTest();
//		System.out.println( equalsWithoutIgnoreCase("ALABAMA", "alabama") );
//		startsWithTest();
//		containsTest();
//		replaceTest();
//		charConversionTest();
		splitTest();
		
	}
	
	
	public static void splitTest() {
		String greeting = "  Hello \n ";		// [He, , o]
		String csvHeader = "name,last name,id,gender   ";
		String csvRow1 = "John,Doe,89,male";
		
		greeting = greeting.trim();
		csvHeader = csvHeader.trim();
		
		String[] headers = csvHeader.split(",");
		String[] row1 = csvRow1.split(",");
		
		String[] hello = greeting.split("e", 2);
		
		System.out.println( Arrays.toString( hello ) );
		System.out.println( Arrays.toString( headers ) );
		System.out.println( Arrays.toString( row1 ) );
	}
		
	public static void charConversionTest() {
		String greeting = "H ello";
		char[] hello = greeting.toCharArray();
		
		System.out.println( Arrays.toString(hello) );
		
		char[] test = new char[greeting.length()];
		for (int i = 0; i < greeting.length(); i++) {
			test[i] = greeting.charAt(i);
		}
		
		System.out.println( Arrays.toString(test) );
	}
	
	public static void replaceTest() {
		String sample = "Just a test";
		
		/*for (int i = 0; i < sample.length(); i++ ) {
			if (sample.charAt(i) == 't') {
				sample = sample.substring(0, i) + 'y' + sample.substring(i + 1);
			}
		}*/
		
		sample = sample.replace("st", "Y");
		System.out.println( sample );
	}
	
	public static void containsTest() {
		String sample = "This is just a test";
		
		System.out.println( sample.contains("T") );
	}
	
	public static void startsWithTest() {
		String sample = "This is just a test";
		
		System.out.println( sample.startsWith( "This" ) );
		System.out.println( sample.indexOf( "This" ) );
		
		System.out.println( sample.endsWith("test") );
		System.out.println( sample.lastIndexOf("test") == sample.length() - "test".length()  );
	}
	
	public static boolean equalsWithoutIgnoreCase(String a, String b) {
		a = a.toUpperCase(); // ALABAMA
		b = b.toUpperCase(); // ALABAMA
		
		return a.equals(b);
	}
	
	public static void equalsIgnoreCaseTest() {
		String a = "alabama";
		String A = "ALABAMA";
		
		System.out.println( a.equalsIgnoreCase(A) );
	}
	
	public static void charAtTest() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a message: ");
		char firstChar = scan.nextLine().charAt(3);
		
		System.out.println(firstChar);
		
		scan.close();
	}
	
	public static void substringTest() {
		String sample = "Let's take a look at a summary of how";
		
		String startingWord = "take";
		String endingWord = "summary";
		
		int start = sample.indexOf( startingWord );
		int secondIndex = sample.indexOf(endingWord);

		String substring = sample.substring(start, secondIndex + endingWord.length());
		
		System.out.println(substring);
	}
	
	public static void indexOfTest() {
		String sample = "String class has a similar, but a better";
		
		int charAIndex = sample.indexOf('a');
		System.out.println( charAIndex );
		
		charAIndex = sample.indexOf('a', (charAIndex + 1) );
		System.out.println( charAIndex );
		
		charAIndex = sample.indexOf('a', (charAIndex + 1) );
		System.out.println( charAIndex );
		
		int classIndex = sample.indexOf( "class", 9 );
		System.out.println(classIndex);
		
		//TASK:
		/* Create a loop that will print all occurrences of given character
		 * The loop should terminate if there are no more given characters left 
		 * in a String.*/
	}

	public static void lengthTest() {
		char[] hello = {'H', 'e', 'l', 'l', 'o'};
		
		String greeting = "Hello";
		
		int arraySize = hello.length;
		int stringLength = greeting.length();
		
		System.out.println("Array's length: " + arraySize);
		System.out.println("String's length: " + stringLength);
	}
}
