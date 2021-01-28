package constructorConcept;

public class ConstructorManyParameters {

	int modelYear;    //instance variable
	String modelName; //instance variable

	// This is the constructor, no return type
	public ConstructorManyParameters(int year, String name) {
		modelYear = year;
		modelName = name;
	}

	public static void main(String[] args) {
		ConstructorManyParameters myCar = new ConstructorManyParameters(2004, "Maruti Zen");
		System.out.println(myCar.modelYear + " " + myCar.modelName);
	}
}

//Outputs 2004 Maruti Zen