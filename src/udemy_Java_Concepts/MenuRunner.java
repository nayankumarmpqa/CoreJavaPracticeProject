package udemy_Java_Concepts;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number");
		int a = scanner.nextInt();

		System.out.println("The entered number is : " + a);
	}

}
