package udemy_Java_Concepts;

import java.util.Scanner;

public class IfStatementRunner {

	public static void main(String[] args) {

		System.out.println(determineNameOftheDay(12));
		System.out.println(nameOftheMonth(5));
		System.out.println(isWeekDay(100));

		// palindromExample();
		// palindromStringExample();
	}

	public static String determineNameOftheDay(int dayNumber) {

		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		case 7:
			return "Sunday";

		/*
		 * default: return "Invalid Day Number default";
		 */

		}

		return "Invalid Day Number";

	}

	public static String nameOftheMonth(int monthNum) {

		switch (monthNum) {

		case 1:
			return "Jan";
		case 2:
			return "Feb";
		case 3:
			return "Mar";
		case 4:
			return "Apr";
		case 5:
			return "May";
		case 6:
			return "Jun";
		case 7:
			return "Jul";
		case 8:
			return "Aug";
		case 9:
			return "Sept";
		case 10:
			return "Oct";
		case 11:
			return "Nov";
		case 12:
			return "Dec";
		}
		return "Not a Valid month Number";

	}

	public static boolean isWeekDay(int dayNumber) {

		switch (dayNumber) {
		case 0:
		case 6:
			return false;
		case 1:
		case 2:

		case 3:

		case 4:

		case 5:

		case 7:
			return true;
		}
		return false;
	}


	public static void validateVarI() {

		int i = 27;

		if (i == 25) {
			System.out.println("i = 25");
		} else if (i == 24) {
			System.out.println("i = 24");
		} else if (i == 23) {
			System.out.println("i = 23");
		} else {
			System.out.println("not 23, 24, 25");
			System.out.println(1);
		}

	}

	public static void palindromExample() {
		
		int r,sum=0,temp;
		int n=454;//It is the number variable to be checked for palindrome

		temp=n;
		while(n>0){
		r=n%10; //getting remainder
		sum=(sum*10)+r;
		n=n/10; }
		if(temp==sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

	}

	public static void palindromStringExample() {
		String original, reverse = ""; // Objects of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");
	}

}
