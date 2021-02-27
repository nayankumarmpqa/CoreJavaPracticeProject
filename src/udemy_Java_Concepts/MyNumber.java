package udemy_Java_Concepts;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		// number will be prime if they are divisible by 2 to the number
		// we need to check from 2 to number -1

		if (number < 2) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
			return false;
			}
		}
		return true;
	}

	public int sumUpToN(int number) {
		// 1+2+3+...n

		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum = sum + i;
		}
		return sum;

	}

	public int sumOfDeviser(int number) {
		// 6 except 1 and 6

		int sum = 0;

		for (int i = 2; i < number; i++) {
			if (number % 1 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public void printNumberTriangle(int number) {

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
	}

}
