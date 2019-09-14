package session06;

import java.util.Scanner;

public class AssignmentNotes {
	public static void main(String[] args) {
		run();
	}
	
	/**
	 * This method is called from the main method
	 * It instantiates Scanner object and
	 * stores user's input in 3 int variables.
	 * Then, the method calls maximus() and minimus()
	 * to display which of the user's inputs is the 
	 * highest, which is the lowest number.
	 */
	public static void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the first number: ");
		int numberOne = input.nextInt();
		System.out.print("Please input the second number: ");
		int numberTwo = input.nextInt();
		System.out.print("Please input the third number: ");
		int numberThree = input.nextInt(); // calling my methods to find maximum and minimum numbers
		maximus(numberOne, numberTwo, numberThree);
		minimus(numberOne, numberTwo, numberThree);
	}

	/**
	 * * The method takes 3 int parameters and finds out the maximum numbers
	 * * @param number1 
	 * * @param number2 
	 * * @param number3
	 */
	public static void maximus(int number1, int number2, int number3) {
		int maximumNumber = Math.max(number1, Math.max(number2, number3));
		System.out.println("The maximum number is: " + maximumNumber);
	}

	/**
	 * * The method takes 3 int parameters and finds out the minimum numbers
	 * * @param number1 
	 * * @param number2 
	 * * @param number3
	 */
	public static void minimus(int number1, int number2, int number3) {
		int minimumNumber = Math.min(number1, Math.min(number2, number3));
		System.out.println("Minimum number is: " + minimumNumber);
	}
}
