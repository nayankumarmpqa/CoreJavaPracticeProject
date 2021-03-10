package javaBySSS;

public class FinalConcept {

	public static void main(String[] args) {

//		Gfg gfgobj = new Gfg();

		System.out.println("Value of PI is = " + Gfg.PI);
		System.out.println("Value of THRESHOLD is = " + Gfg.EULERCONSTANT);

	}

}

class Gfg {
	// a final variable
	// direct initialize
	final int THRESHOLD = 5;
//-------------------------------------------------------
	// a blank final variable
	final int CAPACITY;

	// instance initializer block for
	// initializing CAPACITY
	{
		CAPACITY = 25;
	}

//-------------------------------------------------------

	// another blank final variable
	final int MINIMUM;

	// constructor for initializing MINIMUM
	// Note that if there are more than one
	// constructor, you must initialize MINIMUM
	// in them also
	public Gfg() {
		MINIMUM = -1;
	}

//-------------------------------------------------------

	// a final static variable PI
	// direct initialize
	static final double PI = 3.141592653589793;

//-------------------------------------------------------

	// a blank final static variable
	static final double EULERCONSTANT;

	// static initializer block for
	// initializing EULERCONSTANT
	static {
		EULERCONSTANT = 2.3;
	}

}
