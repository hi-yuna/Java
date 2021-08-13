
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num;
		num = new int[3];

		num[0] = 1;
		num[1] = 2;
		num[2] = 3;

		for (int n : num) {
			System.out.println("정수 배열 값: " + n);
		}

		String[] name;
		name = new String[3];

		name[0] = "김연경";
		name[1] = "안산";
		name[2] = "신유빈";

		for (String n : name) {
			System.out.println("문자열 배열 값: " + n);
		}

	}

}
