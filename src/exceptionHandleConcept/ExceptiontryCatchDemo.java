package exceptionHandleConcept;

public class ExceptiontryCatchDemo {
	int a = 7, b = 0;

	public void calculate() {

		try {
			//int k = a / b;
			//System.out.println(k);
			//above code create airthmetic exception
			
			int[] arr = new int[5];
			System.out.println(arr[6]);
		} 
		catch(ArithmeticException ae) {
			System.out.println("I got the ArithmeticException");

		}
		catch(IndexOutOfBoundsException ibe) {
			System.out.println("I got the IndexOutOfBoundsException");

		}
		
		
		
		
		catch (Exception exc) 
		//1 try can have multiple catch block
		{
			
			System.out.println("I got an error/exceptoin");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptiontryCatchDemo obj = new ExceptiontryCatchDemo();
		obj.calculate();
	}

}
