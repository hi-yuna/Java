import java.math.BigDecimal;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n = 2.0;
		double n2 = 1.1;
		System.out.println(n - n2);

		BigDecimal m = new BigDecimal("2.0");
		BigDecimal m2 = new BigDecimal("1.1");
		System.out.println(m.subtract(m2));

	}

}
