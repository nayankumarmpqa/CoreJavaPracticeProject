package udemy_Java_Concepts;

public class IfStatementRunner {

	public static void main(String[] args) {

		System.out.println(determineNameOftheDay(12));
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

}
