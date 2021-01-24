package arrayExamples;

public class MultidimensionalArray {

	public static void main(String[] args) {
		 // create a 2d array
		
		int[][] a = 
			{
					{1,2,3},
					{4,5,6,9},
					{7,9}
			};
		
		//Calculate the length of the each array row
		
		System.out.println("Length of row 1 is = " + a[0].length);
		
		System.out.println("Length of row 2 is = " + a[1].length);
		System.out.println("Length of row 3 is = " + a[2].length);

	
		//Example: Print all elements of 2dimentional array Using Loop
	
		 int[][] a2 = {
		            {1, -2, 3}, 
		            {-4, -5, 6, 9}, 
		            {7}, 
		        };
	
		 
		 for(int i=0; i<a2.length; i++)
		 {
			 for (int j=0;j<a2[i].length; j++)
			 {
				 System.out.print(a2[i][j]+" ");
				
			 } System.out.println("");
		 }
		 
		 
		 
		 // first for...each loop access the individual array
	        // inside the 2dim array
	      System.out.println("We can also use the for...each loop to access elements of the multidimensional array. For example,"); 
		 for (int[] innerArray: a2) {
	            // second for...each loop access each element inside the row
	            for(int data: innerArray) {
	                System.out.print(data + " ");
	            } System.out.println("");
	        }
	}

}
