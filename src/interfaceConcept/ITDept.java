package interfaceConcept;


public abstract class ITDept implements InterfaceEmp{

	public void goodies() {
		System.out.println("It giving goddies");
	}

	public void work() {
		System.out.println("It giving work laptop");

	}

	public abstract void salary();
	//IT department can not give salary but HR
	
	
}
