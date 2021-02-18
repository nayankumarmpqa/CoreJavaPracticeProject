package udemy_Java_Concepts;

public class MultiplicationTable {
// this is multiplicaiton table program
	// 5*1 = 1
	// 5*10=50

	public void printTable() {

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d* %d= %d", 5, i, 5 * i).println(); // formatter printf
		}

	}
	
	
	
	public void printTable(int number) { //also overloading
		printTable(number, 1, 10); // refactoring I am reusing next method in this method

		/*
		 * for (int i = 1; i <= 10; i++) { System.out.printf("%d* %d= %d", number, i,
		 * number * i).println(); // formatter printf }
		 */
	}
	
	
	public void printTable(int number, int from , int to) { //also overloading

		for (int i=from; i <= to; i++) {
			System.out.printf("%d* %d= %d", number, i, number * i).println(); // formatter printf
		}

	}

}
