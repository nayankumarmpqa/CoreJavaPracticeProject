package constructorConcept;

public class ConstructorParameters {

		  int x;

		  public ConstructorParameters(int y) { // This is the constructor, no return type 
		    x = y;
		  }

		  public static void main(String[] args) {
			ConstructorParameters myObj = new ConstructorParameters(5);
		    System.out.println(myObj.x);
		  }
		}

		// Outputs 5

