package udemy_Java_Concepts;

public class BiNumber {

	private int n1, n2;

	public BiNumber(int i, int j) {
		this.n1 = i;
		this.n2 = j;
	}

	public int addNumber() {
		return n1 + n2;
	}

	public int multiplyNum() {
		return n1 * n2;
	}

	public boolean doubleNum() {
		n1 *= 2; // doubling the number
		n2 *= 2;
		return true;
	}

	/**
	 * @return the n1
	 */
	public int getN1() {
		return n1;
	}

	/**
	 * @param n1 the n1 to set
	 */
	public void setN1(int n1) {
		this.n1 = n1;
	}

	/**
	 * @return the n2
	 */
	public int getN2() {
		return n2;
	}

	/**
	 * @param n2 the n2 to set
	 */
	public void setN2(int n2) {
		this.n2 = n2;
	}

}

