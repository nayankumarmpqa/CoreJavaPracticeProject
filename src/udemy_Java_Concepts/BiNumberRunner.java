package udemy_Java_Concepts;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber bn = new BiNumber(3,5);

		BiNumber bn2 = new BiNumber(2, 4);

		System.out.println(bn.getN1());
		System.out.println(bn.getN2());

		System.out.println(bn.addNumber());
		System.out.println(bn.multiplyNum());
		System.out.println(bn.doubleNum());
		
		System.out.println(bn.getN1());
		System.out.println(bn.getN2());

		// I am using 2nd object for below code execution
		System.out.println(bn2.doubleNum());

		System.out.println(bn2.getN1());
		System.out.println(bn2.getN2());

	}
}
