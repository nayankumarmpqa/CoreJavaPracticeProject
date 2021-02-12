package udemy_Java_Concepts;

public class Book {

	// add state

	private int numberOfcopies;
	// add behavior

	public void setNumberOfcopies(int numberOfcopies) {
		this.numberOfcopies = numberOfcopies;
	}

	public void getNumberOfcopies() {
		System.out.println(numberOfcopies);
	}

	void increaseCopies(int howmuch) {

		this.numberOfcopies = this.numberOfcopies + howmuch;
	}

	void decreaseCopies(int howmuch) {

		this.numberOfcopies = this.numberOfcopies - howmuch;
	}

	int getNOC() {
		return this.numberOfcopies;
	}
}
