package udemy_Java_Concepts;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book aocp = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		aocp.setNumberOfcopies(100);
		effectiveJava.setNumberOfcopies(60);
		cleanCode.setNumberOfcopies(50);
		aocp.getNumberOfcopies();
		effectiveJava.getNumberOfcopies();
		cleanCode.getNumberOfcopies();

		System.out.println(aocp.getNOC());

		aocp.increaseCopies(50);
		System.out.println(aocp.getNOC());

		aocp.decreaseCopies(15);
		System.out.println(aocp.getNOC());

	}


}
