package javaBySSS;

class Animal {
	void eat() {
		System.out.println("eating.");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog is eating.");
	}
}

public class MethodOverridingEx {

	public static void main(String args[]) {
		Dog d1 = new Dog();
		Animal a1 = new Animal();
		d1.eat();
		a1.eat();
	}
}



/*Output:
 
 // Derived class method eat() runs
Dog is eating

// Base class method eat() runs
eating 

*/