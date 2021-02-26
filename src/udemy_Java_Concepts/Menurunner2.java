package udemy_Java_Concepts;

import java.util.Scanner;

public class Menurunner2 {

	public static void main(String[] args) {

		Scanner scannerobj = new Scanner(System.in); // creating scanner object with System input params
		System.out.print("Please enter a number 1"); // Printing the text on console
		int number1 = scannerobj.nextInt(); // assigning number1 input by user

		System.out.print("Please enter a number 2"); // Printing the text on console
		int number2 = scannerobj.nextInt(); // assigning number2 input by user

		// above lines scans the next token of input as integer
		// and returns an integer to numner1 and number2

		System.out.println("Choices available are");
		System.out.println("1 - Add");
		System.out.println("2 - Substract");
		System.out.println("3 - Devide");
		System.out.println("4 - Multiply");

		System.out.print("Enter your Choice from the above menu please : ");

		int choice = scannerobj.nextInt(); // assigning choice input by user to a variable 'choice'

		System.out.println("You have entered 1st number as: " + number1);
		System.out.println("You have entered 2nd number as: " + number2);
		System.out.println("Selected Choice from the Menu is : " + choice);

		// ifelseCalc(number1, number2, choice);
		// use above object when need ifelseCalc
		switchcaseCalc(number1, number2, choice);
		// use above object when need Switch case Calc

	}

	/**
	 * @param number1
	 * @param number2
	 * @param choice
	 */
	private static void switchcaseCalc(int number1, int number2, int choice) {
		System.out.println("switchcaseCalc method initiated");

		switch (choice) {
		case 1:
			System.out.println("Addition Result is = " + (number1 + number2));
			break;

		case 2:
			System.out.println("Substraction Result is = " + (number1 - number2));
			break;

		case 3:
			System.out.println("Devide Result is = " + (number1 / number2));
			break;

		case 4:
			System.out.println("Multiply Result is = " + (number1 * number2));
			break;
		default:
			System.out.println("Invalid optio " + choice);
			break;
		}
	}

	/**
	 * @param number1
	 * @param number2
	 * @param choice
	 */
	private static void ifelseCalc(int number1, int number2, int choice) {
		System.out.println("ifelseCalc method initiated");
		if (choice == 1) {
			System.out.println("Addition Result is = " + (number1 + number2));
		} else if (choice == 2) {
			System.out.println("Substraction Result is = " + (number1 - number2));
		} else if (choice == 3) {
			System.out.println("Devide Result is = " + (number1 / number2));
		} else if (choice == 4) {
			System.out.println("Multiply Result is = " + (number1 * number2));
		} else {
			System.out.println("Invalid optio " + choice);
		}
	}

}
