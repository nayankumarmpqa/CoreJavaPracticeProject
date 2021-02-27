package udemy_Java_Concepts;

import java.util.Scanner;

public class DoWhileRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // creating a object of scanner class for usre input
		int num = -1;
		do {
			if (num > 0) {
				System.out.println("cube of the number is = " + (num * num * num));
			}
			System.out.println("enter a num to find a cube");
			num = sc.nextInt();
		} while (num > 0);

		System.out.println("zero or -ve number. Thank you have fun!");

	}

}
