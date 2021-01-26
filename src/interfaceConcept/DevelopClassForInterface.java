package interfaceConcept;

public class DevelopClassForInterface implements InterfaceGivenByBankClient,Interface2GivenByBankInvestmentClient {

	public static void main(String[] args) {
		// Add all unimplemented methods and do not miss any one
		// Create an object of this class which is to implement InterfaceGivenByBankClient
		
		DevelopClassForInterface dobject= new DevelopClassForInterface();
		// above line says dobject can call methods from DevelopClassForInterface return type interface

		
		dobject.payCreditCard();
		dobject.checkBalance();
		dobject.checkMyAddress();
		dobject.Interface2MakeInvestmetns();
		dobject.Interface2MakeInvestmetns();
		
		
		
		InterfaceGivenByBankClient iobject= new DevelopClassForInterface();
		// above line says iobject can call methods from InterfaceGivenByBankClient return type interface
		// You can not call checkMyAddress method here.
		// It is called runtime polymorphism
		
		
		iobject.payCreditCard();
		iobject.checkBalance();
		//iobject.checkMyAddress();
		
		
		
		Interface2GivenByBankInvestmentClient i2object= new DevelopClassForInterface();
		// above line says i2object can call methods from InterfaceGivenByBankClient return type interface
		// You can not call checkMyAddress method here.
		// It is called runtime polymorphism
		
		
		i2object.Interface2MakeInvestmetns();
		i2object.Interface2MaketransferInvestmetns();
		//i2object.checkMyAddress();
		
	}

	@Override
	public void payCreditCard() {
		// TODO Auto-generated method stub
		
		System.out.println("Interface1 payCreditCard Implemented");
	}

	
	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Interface1 checkBalance Implemented");

	}

	@Override
	public void transferBalance() {
		// TODO Auto-generated method stub
		System.out.println("Interface1 transferBalance Implemented");

	}

	
	public void checkMyAddress() {
		// TODO Auto-generated method stub
		System.out.println("CheckMyAddress Implemented which is not an interfaced method");

	}

	
	
	// Below are the methods coming from Interface2GivenByBankInvestmentClient
	@Override
	public void Interface2MakeInvestmetns() {
		System.out.println("Interface2MakeInvestmetns Implemented");
	}

	@Override
	public void Interface2MaketransferInvestmetns() {
		System.out.println("Interface2MaketransferInvestmetns Implemented");
	}
	
	
	
}
