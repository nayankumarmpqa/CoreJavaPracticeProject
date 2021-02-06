package javaBySSS;

public class MethodOverloadingEx {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String args[]) {
		System.out.println(add(4, 6));
		System.out.println(add(4, 6, 7));
	}
}



/*

Output:

//Here, add with two parameter method runs
10 

// While here, add with three parameter method runs 
17 

*/