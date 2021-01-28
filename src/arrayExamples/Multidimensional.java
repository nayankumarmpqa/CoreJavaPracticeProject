package arrayExamples;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[2][3];

		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;

		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;

		// System.out.println(a[0][1]);

		int[][] b = { { 2, 4, 50 }, { 3, 7, 7 }, { 5, 1, 0 } };

		// Printing array and finding number '1'

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (b[i][j] == 1) {
					//System.out.println("we got the number 1 at = " + b[i][j]);
					System.out.print(b[i][j]+ " ");
				} else
					System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		// Printing smallest number
		int min = b[0][0];
		int columnOfminnum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (b[i][j] < min) {
					min = b[i][j];
					columnOfminnum = j;

				}
			}
		}
		System.out.println("we found the smallest number :" + min);
		System.out.println("we found the smallest number' column :" + columnOfminnum);


		// Printing largest number
		int max = b[0][0];
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (b[i][j] > max) {
					max = b[i][j];
				}
			}
		}
		//System.out.println("we found the largest number :" + max);

		int startingrow = 0;
		int maxinmincolumn = b[0][columnOfminnum];

		for (startingrow = 0; startingrow < 3; startingrow++) {

			if (b[startingrow][columnOfminnum] > max) {
				max = b[startingrow][columnOfminnum];
			}
		}
		System.out.println("we found the largest number' in maincolumn :" + maxinmincolumn);

	}

}
