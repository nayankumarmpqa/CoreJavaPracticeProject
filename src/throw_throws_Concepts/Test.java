package throw_throws_Concepts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	static int s;
	int ns;

	public static void sm() {
		s = 9;
		System.out.println(s);
		//System.out.println(ns);
		

	}

	public void nsm() {
		System.out.println(s);
		System.out.println(ns);
		s = 10;
	}

	public static void main(String[] args) throws Exception {

		// Test t = new Test();
System.out.println(s);
sm();
//nsm();


//System.out.println(ns);


	}
}


 class Test2 {
	 
	 
 }
 
