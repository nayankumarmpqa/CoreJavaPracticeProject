package udemy_Java_Concepts;

import java.math.BigDecimal;

public class SimpleIntcalc {

	BigDecimal principle;
	BigDecimal rate;

	public SimpleIntcalc(String principle, String rate) {
		this.principle = new BigDecimal(principle);
		this.rate = new BigDecimal(rate).divide(new BigDecimal(100));
	}

	public BigDecimal calculateVlaueforYears(int i) {

		BigDecimal interest = principle.multiply(rate).multiply(new BigDecimal(i));
		BigDecimal total = interest.add(principle);
		return total;
	}

}
