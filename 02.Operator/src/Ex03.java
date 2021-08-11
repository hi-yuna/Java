
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 5;

		System.out.println(a == b); // F
		System.out.println(a > b);  // T
		System.out.println(a >= b); // T
		System.out.println(a < b);  // F
		System.out.println(a <= b); // F
		System.out.println(a != b); // T

		boolean result = a > b;
		System.out.println(result); // T

	}

}
