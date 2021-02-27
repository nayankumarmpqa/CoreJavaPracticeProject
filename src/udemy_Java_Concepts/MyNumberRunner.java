package udemy_Java_Concepts;

public class MyNumberRunner {

	public static void main(String[] args) {

		MyNumber number = new MyNumber(0);
		boolean isPrime = number.isPrime();
		System.out.println("is the number Prime ? Ans is = " + isPrime);

		System.out.println("Sum upto the given number is = " + number.sumUpToN(5));
		System.out.println("Sum of the given number devisers is= " + number.sumOfDeviser(5));

		number.printNumberTriangle(5);

	}

}
