package udemy_Java_Concepts;

import java.util.Scanner;

public class Menurunner2 {

	public static void main(String[] args) {

		Scanner scannerobj = new Scanner(System.in);
		System.out.print("Please enter a number 1");
		int number1 = scannerobj.nextInt();
		// scans the next token of input as integer
		// and returns an integer
		System.out.print("Please enter a number 2");
		int number2 = scannerobj.nextInt();

		System.out.println("Choices available are");
		System.out.println("1 - Add");
		System.out.println("2 - Substract");
		System.out.println("3 - Devide");
		System.out.println("4 - Multiply");

		System.out.print("Enter your Choice please : ");

		int choice = scannerobj.nextInt();

		System.out.println("You Inputs were");
		System.out.println("you have entered 1st number: " + number1);
		System.out.println("you have entered 2nd number: " + number2);
		System.out.println("Selected Choice is : " + choice);

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
