package udemy_Java_Concepts;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber bn = new BiNumber(3,5);

		System.out.println(bn.getN1());
		System.out.println(bn.getN2());

		System.out.println(bn.addNumber());
		System.out.println(bn.multiplyNum());
		System.out.println(bn.doubleNum());
		
		System.out.println(bn.getN1());
		System.out.println(bn.getN2());
	}
}
