package javaBySSS;

public class WrapperClassDemo {

	
	public static void main(String[] args) {
		int a = Integer.parseInt("123");
		System.out.println(a);
		
		int parsint = Integer.parseInt("89");
		System.out.println(parsint);
		
		Integer refva = Integer.valueOf("565");
		int intval =refva.intValue();
		System.out.println(intval);
		
		
		
		/*
		 * valueOf() 
		 * ststic method 
		 * return object ref of relative wrapper class
		 * 
		 * parsexxx() 
		 * static method xxx can be replaced by any primitive type 
		 * it returns
		 * xxx type value
		 * 
		 * xxxValue() 
		 * instance method of wrapper class 
		 * xxx can be replaced by any
		 * primitive type returns corresponding primitive type
		 */
	}

}
