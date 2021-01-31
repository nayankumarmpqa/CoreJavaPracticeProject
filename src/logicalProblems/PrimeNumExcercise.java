package logicalProblems;

import java.util.Scanner;

public class PrimeNumExcercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declare the variables
		int lower, upper, i, j;

		// Ask user to enter lower value of interval
		System.out.print("Enter lower bound of the interval: ");
		lower = sc.nextInt(); // Take input

		// Ask user to enter upper value of interval
		System.out.print("Enter upper bound of the interval: ");
		upper = sc.nextInt(); // Take input

		// Traverse each number in the interval
		// with the help of for loop
		for (i = lower; i <= upper; i++) {
						
			for (j = 2; j <= i; j++) {
				if (i % j == 0)
					// flag = 0;
					break;
				}

			if (j == i)
				System.out.println(i);
		}
	}

}
