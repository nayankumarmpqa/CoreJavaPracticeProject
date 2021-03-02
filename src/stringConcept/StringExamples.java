package stringConcept;

public class StringExamples {

	public static void main(String[] args) {

		String s = new String("Nayan");

		s.toUpperCase();
		// it is returing uppercase string but no permanent changes to the actual
		// string.

		System.out.println(s);
		System.out.println(s.toUpperCase());

		s.toLowerCase();
		System.out.println(s);

		System.out.println(s.toLowerCase());

		int i = s.indexOf('N');
		System.out.println(i);

	}

}
