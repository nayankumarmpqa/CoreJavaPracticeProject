package finallyConcept;

public class FinallyDemo {

	public void test()
	{
		
		try {
	
		int a=1;
		System.out.println(a/0);
		
	}
	catch(ArithmeticException ae) {
		
	
		System.out.println("we get the ArithmeticException " + ae);
	}
		
	
	finally
	{
	
		System.out.println("executed finally code");
	}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinallyDemo fdobj =new FinallyDemo();
		fdobj.test();
	}

}
