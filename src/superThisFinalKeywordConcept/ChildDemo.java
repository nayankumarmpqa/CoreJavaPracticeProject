package superThisFinalKeywordConcept;

public class ChildDemo extends ParentDemo {

	String name = "QAclickAcademy";

	ChildDemo() {
		// please rememer in a constructor if we use super. it will always be 1 line in
		// the constructor.

		super();// it is always be 1st line
		System.out.println("Child class constructor");
	}

	public void getString() {

		System.out.println(name); // it refers to the local variable

		// super keyword refer to the parent class

		System.out.println("super keyword refer to the parent class: " + super.name);

	}

	public void getData() {

		super.getData();
		System.out.println("I am child class method getData");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo cd = new ChildDemo();

		cd.getString();
		cd.getData();

	}

}
