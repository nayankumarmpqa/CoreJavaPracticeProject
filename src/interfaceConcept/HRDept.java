package interfaceConcept;

public class HRDept extends ITDept{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HRDept hrObj = new HRDept();
		hrObj.goodies();
		hrObj.work();
		hrObj.salary();
		
		
		ITDept itObj = new HRDept();
		itObj.salary();
		
		//ITDept itObj = new ITDept();
		// see above we can not create object of a class which is not fully implemented		
		
		
	}

	public void salary() {
		// it was an unimplemented method by it department class
		System.out.println("HR giving salary 10Lakh");

		
	}
	
	public void pf() {
		// it was an unimplemented method by it department class
		System.out.println("HR giving  PF");

		
	}

}
