package javaBySSS;

//Java code for using 'this' keyword  
//to return the current class instance 
class ThisConcept {
	int a;
	int b;

	// Default constructor
	ThisConcept() {
		a = 10;
		b = 20;
	}

	// Method that returns current class instance

	ThisConcept get() {
		return this;
	}

	// Displaying value of variables a and b
	void display() {
		System.out.println("a = " + a + "  b = " + b);
	}


	public static void main(String[] args) {
		ThisConcept object = new ThisConcept();
		object.get().display();
		object.display();

	}
}

