package arrayExamples;

public class LoopingThroughArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// First array
		int[] mobNo = new int[10];
		mobNo[0] = 8;
		mobNo[1] = 6;
		mobNo[2] = 9;
		mobNo[3] = 9;
		mobNo[4] = 7;
		mobNo[5] = 2;
		mobNo[6] = 6;
		mobNo[7] = 0;
		mobNo[8] = 1;
		mobNo[9] = 8;
		// Second array
		int[] mobNum = { 8, 6, 9, 9, 7, 2, 6, 0, 1, 8 };

		System.out.println("We are now printing mobNum array");

		for (int i = 0; i < 10; i++) {
			System.out.print(mobNum[i]);

		}

		// Sum and Average of array

		int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };

		int sum = 0;
		Double average;

		for (int i = 0; i < numbers.length; i++) {

			// System.out.println(sum);
			sum += numbers[i];

		}
		System.out.println("");
		System.out.println("Sum of array is: " + sum);

		// get the total number of elements

		int arrayLenght = numbers.length;

		// calculate the average
		// convert the average from int to double

		average = ((double) sum / (double) arrayLenght);

		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);

		// Example 1: Print Array Elements

		// create an array
		int[] numbersArray = { 3, 9, 5, -5 };

		// for each loop
		System.out.print("Example 1: Print Array Elements:");
		for (int number : numbersArray) {
			System.out.print(number + ",");

		}

	}
}
