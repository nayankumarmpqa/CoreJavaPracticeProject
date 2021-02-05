package javaBySSS;

public class HelloWorld { // outer class can be public or non only

	int a = 123;
	int hexadecimal = 0x123;
	int octal = 0235;
	int binary = 0b111010;

	short shortint = 1;
	/*
	 * byte; long; char; boolean; double
	 */

 //System.out.println("hi");
	// System.out.println("hexadecimal" + hexadecimal);
	// System.out.println("octal" + octal);
	// System.out.println("binary" + binary);

	// Widening Conversion
	int y = 3;
	float x = y; // widening conversion

	float xx = 3.4f;
	// int i1 = xx;// narrowing conversion error

	int y1 = (int) x; // no error it is type casting

	int abc; // only declaration no initialization
	// System.out.println(abc); // we can not print un initialized variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Hello world");
		// .means us class ka statis member name
		// out is a statis reference valuable repreenting object (like a pointer)
		// .println is println is member function of printstream class

	}

}
