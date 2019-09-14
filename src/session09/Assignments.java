package session09;

import java.util.Scanner;

public class Assignments {

	public static void main(String[] args) {
		reverseNumber();
	}
	
	public static void reverseNumber() {
		Scanner input = new Scanner(System.in);
		int result = 1;
		System.out.print("make an entry: ");
		int userInput = input.nextInt();
		
		while (userInput > 0) {
			result = userInput % 10;
			System.out.print(result);
			userInput /= 10;
		}
	}

	public static void letsPlay() {
		Scanner input = new Scanner(System.in);
		int secretNumber = 6;
		int userNumber;
		int counter = 1;

		System.out.print("Please enter your number:");
		userNumber = input.nextInt();

		while (!isGuessed(userNumber, secretNumber)) {
			errorPrinter(userNumber, secretNumber);
			userNumber = input.nextInt();
			counter++;

		}

		System.out.println("Conguratulations you won, you tried " + counter + " times");

	}

	public static boolean isGuessed(int userNumber, int secretNumber) {
		return userNumber == secretNumber;
	}

	public static void errorPrinter(int userNumber, int secretNumber) {
		if (userNumber >= 0 && userNumber <= 9) {
			if (userNumber > secretNumber) {
				System.out.print("your number is larger, please try again: ");
			} else {
				System.out.print("your number is smaller, please try again: ");
			}
		} else {
			System.out.print("Wrong input, try again: ");
		}
	}

	public static void fooBar(int x) {

		int counter = 1;
		while (x > 0) {
			if ((counter % 3 == 0) && (counter % 5 == 0)) {
				System.out.println("FooBar");
				counter++;
			} else if (counter % 3 == 0) {
				System.out.println("Foo");
				counter++;
			} else if (counter % 5 == 0) {
				System.out.println("Bar");
				counter++;
			} else {
				System.out.println(counter++);
			}
			x--;
		}

	}

	public static void testFooBar(int x) {

		int counter = 1;

		while (counter <= x) {

			if (counter % 15 == 0) {
				System.out.println("FooBar");
			} else if (counter % 3 == 0) {
				System.out.println("Foo");
			} else if (counter % 5 == 0) {
				System.out.println("Bar");
			} else {
				System.out.println(counter);
			}

			counter++;

		}
	}

	public static void switchFooBar(int x) {
		int counter = 1;

		while (counter <= x) {

			switch (counter % 15) {
			case 0:
				System.out.println("FooBar");
				break;
			case 3:
			case 6:
			case 9:
			case 12:
				System.out.println("Foo");
				break;
			case 5:
			case 10:
				System.out.println("Bar");
				break;
			default:
				System.out.println(counter);
			}

			counter++;
		}
	}

}