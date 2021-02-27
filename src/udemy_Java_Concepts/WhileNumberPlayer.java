package udemy_Java_Concepts;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {

		this.limit = limit;
	}

	// method to find and print square of a number up to a limit
	public void squareUpToLimit() {
		int i = 1;
		System.out.print("square of number upto a limit are = ");

		while (i * i < limit) {

			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
	}

	// method to find and print Cube of a number up to a limit

	public void cubeUpToLimit() {
		int i = 1;
		System.out.print("Cube of number upto a limit are = ");

		while (i * i * 1 < limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println();
	}


}
