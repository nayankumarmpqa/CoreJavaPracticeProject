package udemy_Java_Concepts;

public class MyCharCheck {

	private char ch;

	public MyCharCheck(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {

		// Yes we can have multiple return statement in the method
		// Yes when you create a boolean return type method you need to return any one
		// true or false

		if (ch == 'a' || ch == 'A')
			return true;
		if (ch == 'e' || ch == 'E')
			return true;

		if (ch == 'i' || ch == 'I')
			return true;

		if (ch == 'o' || ch == 'O')
			return true;

		if (ch == 'u' || ch == 'U')
			return true;

		return false;

	}

	public boolean isConsonent() {

		if (isAlphabet() && !isVowel())
		return true;

		return false;
	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57)
			return true;

		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 90) // for small a b c
			return true;

		if (ch >= 97 && ch <= 122) // for capital A B C
			return true;

		return false;
	}

	public static void printLoweCase() {
		for (char ch = 'a'; ch <= 'z'; ch++)
			System.out.print(ch + " ");

		System.out.println('\n');
	}

	public static void printUpperCase() {
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch + " ");
	}


}
