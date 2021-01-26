package arrayExamples;

public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] array3D = {

				{ { 1, -2, -3 }, { 2, 3, 5 } },

				{ { -4, -5, 6, 9 }, { 1 }, { 2, 3 } }

		};

		// for..each loop to iterate through elements of 3d array
		for (int[][] array2D : array3D) {
			for (int[] array1D : array2D) {
				for (int item : array1D) {
					System.out.print(item + ",");
				}
				System.out.println("");

			}
		}

		// for loop to iterate through elements of 3d array
		
		System.out.println("for loop to iterate through elements of 3d array");
		for (int i = 0; i < array3D.length; i++) {

			for (int j = 0; j < array3D[i].length; j++) {

				for (int k = 0; k < array3D[i][j].length; j++) {
					System.out.println("[" + i + "][" + j + "][" + k + "]:" + array3D[i][j][k]);
				}

			}
		}

	}
}
