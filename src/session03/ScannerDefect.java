package session03;

import java.util.Scanner;

public class ScannerDefect {
	
	public static void main(String[] args) {
		
		int age;
		String firstName;
		
		String name = "John";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is your age? ");
		age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("What is your name? ");
		firstName = scanner.nextLine();
		
		System.out.println("Hello " + firstName + " at the age of " + age);
		
		System.out.println("The world population is " + 7.5 + " billion");
		
	}

}
