package superThisFinalKeywordConcept;

public class ThisDemo {

	int a =2;
	
	
	public void getData() {
		int a=3;
		System.out.println(a);// it refers to the local/instance variable
		System.out.println(this.a);// it refers to the global variable
		
		
		int sum = a+this.a;
		System.out.println("sum using this keyword is = "+sum);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisDemo td= new ThisDemo();
td.getData();
	}

}
