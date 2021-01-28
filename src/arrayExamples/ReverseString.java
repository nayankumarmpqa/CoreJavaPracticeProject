package arrayExamples;

public class ReverseString {

	public static void main(String[] args) {
		// find if a string is a palindrome strings

		String name = "Jesus";
		String newName = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			newName = newName + name.charAt(i);
		}

		if (newName == name) {
			System.out.println("The given stirng " + name + " is a Palindrome");
		}
		System.out.println("The given stirng " + name + " is NOT a Palindrome");

	}

}
