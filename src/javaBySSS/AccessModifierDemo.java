package javaBySSS;

class AccessModifierDemo1 {

	// ====================class variables==================
	public int pub = 1;

	private int pri = 2;

	protected int pro = 3;

	final int fin = 4;

	static int stat = 5;

	transient int trans = 6;

	volatile int vol = 7;

	// ================================ class functions================
	public void pubf() {
		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(fin);
		System.out.println(stat);
		System.out.println(trans);
		System.out.println(vol);
	}

	public void pub() { // same name as int
		// pub();
		pubf();
		// prif();
		// prof();
		statf();
		// absf();

		// finf();
		// syncf();
		// strif();
		// natf();

		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(fin);
		System.out.println(stat);
		System.out.println(trans);
		System.out.println(vol);
	}

	private void prif() {
		// pub();
		pubf();
		// prif();
		// prof();
		statf();
		// absf();

		// finf();
		// syncf();
		// strif();
		natf();

		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(fin);
		System.out.println(stat);
		System.out.println(trans);
		System.out.println(vol);
	}

	protected void prof() {
		// pub();
		pubf();
		// prif();
		// prof();
		statf();
		// absf();

		// finf();
		// syncf();
		// strif();
		natf();

		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(fin);
		System.out.println(stat);
		System.out.println(trans);
		System.out.println(vol);
	}

	final void finf() {
		// pub();
		pubf();
		// prif();
		// prof();
		statf();
		// absf();

		// finf();
		// syncf();
		// strif();
		// natf();

		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(fin);
		System.out.println(stat);
		System.out.println(trans);
		System.out.println(vol);
	}

	static void statf2() {

	}

	static void statf() { // non-static variable are also known as field
		/*
		 * pubf(); prif(); prof(); finf(); finf(); For all these Cannot make a static
		 * reference to the non-static method
		 * 
		 * syncf(); strif(); natf();
		 */

		statf2(); // Calling same satic fun in same method will casue StackOverflowError

		// However, we CAN type static methods directly by typing the static method();
		// in this is
		// already a static method it will not show compile error
		//

		/*
		 * System.out.println(pub); System.out.println(pri); //For all these Cannot make
		 * a static reference to the non-static variable System.out.println(pro);
		 * System.out.println(fin); System.out.println(trans); System.out.println(vol);
		 */

		System.out.println(stat);
		// System.out.println(this.pub); //Also we Cannot use this in a static context

	}

	synchronized void syncf() {
		// pub();
		pubf();
		// prif();
		// prof();
		statf();
		// absf();

		// finf();
		// syncf();
		// strif();
		// natf();

		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(stat);

		System.out.println(fin);
		System.out.println(trans);
		System.out.println(vol);
	}

	// abstract void absf(); // Abstract methods do not specify a body, either
	// remove modifier or make the
	// class abstract

	native void natf(); // Native methods do not specify a body either remove body or remove modifier

	strictfp void strif() {

		// pub();
		pubf();
		// prif();
		// prof();
		statf();
		// absf();

		// finf();
		// syncf();
		// strif();
		// natf();

		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(fin);
		System.out.println(stat);
		System.out.println(trans);
		System.out.println(vol);
	}

	// ===================Class main method======================
	public static void m1() {

		/*
		 * pubf(); prif(); prof(); finf(); finf(); //we can not call non static methods
		 * directly by typing the method(); in main class because main is already a
		 * static method syncf(); strif(); natf();
		 */
		// we CAN call static methods directly by typing the method(); in main class
		// because main is already a static method
		statf();

		// in order to call non static methods in the static main method we need to make
		// objects
		/*
		 * AccessModifierDemo.pub(); AccessModifierDemo.pubf();
		 * AccessModifierDemo.prif(); AccessModifierDemo.prof();
		 * AccessModifierDemo.absf(); // in a static method Using classname. (dot) we
		 * can call only static mehtods and variable AccessModifierDemo.finf();
		 * AccessModifierDemo.syncf(); AccessModifierDemo.strif();
		 * AccessModifierDemo.natf();
		 */
		AccessModifierDemo1.stat = 10;
		AccessModifierDemo1.statf();

	}

}

public class AccessModifierDemo {

	void m1() {

		AccessModifierDemo1 a2 = new AccessModifierDemo1();

		System.out.println(a2.pub);
		// System.out.println(a2.pri); // However, we can not call/use private and
		// abstract members
		System.out.println(a2.pro);
		System.out.println(a2.fin);
		System.out.println(AccessModifierDemo1.stat);
		System.out.println(a2.trans);
		System.out.println(a2.vol);
	}

	public static void main(String[] args) {

		// we CAN call static methods directly by typing the method(); in its original
		// class because static members are accessible to their whole E.g. statf();

		// we CAN NOT call static methods directly by typing the method(); in its
		// original class because static members are accessible to their whole

		// in order to call static methods in the static members in main method of a
		// separate class we need to mention OrigiinalClassName.(dot)staticMemberName

		AccessModifierDemo1.stat = 20;
		AccessModifierDemo1.statf();

		// in order to call non static methods in the static members in main method of a
		// separate class we need to make objects
		AccessModifierDemo1 a1 = new AccessModifierDemo1();

		System.out.println(a1.pub);
		// System.out.println(a1.pri); // However, we can not call/use private and
		// abstract members
		System.out.println(a1.pro);
		System.out.println(a1.fin);
		System.out.println(AccessModifierDemo1.stat);
		System.out.println(a1.trans);
		System.out.println(a1.vol);

		// a1.pub();
		a1.pubf();
		// a1.prif(); // However, we can not call/use private members (bcoz they are not
		// visible)
		// a1.prof();
		// a1.absf(); // we can not call/use abstract members (bcoz they are not
		// visible)
		// a1.finf();
		// a1.syncf();
		// a1.strif();
		// a1.natf();
		AccessModifierDemo1.stat = 10;
		AccessModifierDemo1.statf();

	}
}
