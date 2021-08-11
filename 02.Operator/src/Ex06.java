
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a = true;
		boolean b = false;

		System.out.println(a && a); // T
		System.out.println(a && b); // F
		System.out.println(b && a); // F
		System.out.println(b && b); // F
		
		System.out.println(a || a); // T
		System.out.println(a || b); // T
		System.out.println(b || a); // T
		System.out.println(b || b); // F
		
		System.out.println(!a); // F
		System.out.println(!b); // T
		
	}

}
