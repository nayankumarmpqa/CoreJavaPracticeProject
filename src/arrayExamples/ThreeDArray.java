package arrayExamples;

public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] Array3D = {

				{ { 1, -2, -3 }, 
					{ 2, 3, 5 }
				},

				{ { -4, -5, 6, 9 },
					{ 1 },
					{ 2, 3 }
				}

		};

		// for..each loop to iterate through elements of 3d array
		for (int[][] array2D : Array3D) {
			for (int[] array1D : array2D) {
				for (int item : array1D) {
					System.out.print(item + ",");
				}
				System.out.println("");

			}
		}
	}

}
