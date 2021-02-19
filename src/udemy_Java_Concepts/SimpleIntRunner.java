package udemy_Java_Concepts;

import java.math.BigDecimal;

public class SimpleIntRunner {

	public static void main(String[] args) {

		SimpleIntcalc sic = new SimpleIntcalc("100", "5.5");

		BigDecimal total = sic.calculateVlaueforYears(1);

		System.out.println(total);

	}

}
