package javaBySSS;

/* superclass Person */
class Person {
	Person() {
		System.out.println("Person class Constructor");
	}
}

/* subclass Student extending the Person class */
class Student extends Person {
	Student() {
		// invoke or call parent class constructor
		super();

		System.out.println("Student class Constructor");
	}
}

/* Driver program to test */
public class SuperConcept2 {
	public static void main(String[] args) {
		Student s = new Student();
	}
}


/*
 * In the above example we have called the superclass constructor using keyword
 * ‘super’ via subclass constructor.
 * 
 * Other Important points:
 * 
 * 1. Call to super() must be first statement in Derived(Student) Class
 * constructor..
 * 
 * 2. If a constructor does not explicitly invoke a superclass constructor, the
 * Java compiler automatically inserts a call to the no-argument constructor of
 * the superclass. If the superclass does not have a no-argument constructor,
 * you will get a compile-time error. Object does have such a constructor, so if
 * Object is the only superclass, there is no problem.
 * 
 * 3. If a subclass constructor invokes a constructor of its superclass, either
 * explicitly or implicitly, you might think that a whole chain of constructors
 * called, all the way back to the constructor of Object. This, in fact, is the
 * case. It is called constructor chaining..
 * 
 * 
 */
