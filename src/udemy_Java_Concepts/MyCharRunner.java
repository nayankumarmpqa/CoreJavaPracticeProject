package udemy_Java_Concepts;

public class MyCharRunner {

	public static void main(String[] args) {

		MyCharCheck mcc = new MyCharCheck('B');

		System.out.println(mcc.isVowel());

		System.out.println("mcc.isConsonent() : " + mcc.isConsonent());

		System.out.println("mcc.isDigit() : " + mcc.isDigit());

		System.out.println("mcc.isAlphabet() : " + mcc.isAlphabet());

		MyCharCheck.printLoweCase(); // className.staticMethodName

		MyCharCheck.printUpperCase(); // className.staticMethodName

	}

}
