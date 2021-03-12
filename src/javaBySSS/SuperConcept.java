package javaBySSS;

class A {

	int x; // instance var in parent class A

	public void overridedFun() { // overriding this method in class B
		System.out.println("overridedFun in class A (i.e Parent/Super class)");
	}
}

class B extends A {
	int x;

	public void fun1() {
		int x = 5; // local int var in class B's method fun1()
		this.x = 20; // int instance variable in class B
		super.x = 100; // int var in super/parent class A
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}

	public void overridedFun() {

		System.out.println("overridedFun in class B (Child/sub class)");
		super.overridedFun();
	}
	// when your method overrides one of the super class method, you can invoke the
	// superclass version of the method through the use of supes keyword
	// It also avoid name conflict b/w member var of super and sub classes.
}

public class SuperConcept {

	public static void main(String[] args) {

		B obj = new B();
		obj.fun1();
		obj.overridedFun();

	}

}
