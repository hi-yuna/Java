
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 12;
		int b = 4;
		int c = 19;

		int max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		System.out.println("최댓값: " + max);
		
	}

}
