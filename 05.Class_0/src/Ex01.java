
public class Ex01 {

	public static void change(int num) {
		num = 20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 전달된 복사본을 수정해도 원래 저장된 변수값은 수정되지 않는다.
		
		int num = 10;
		System.out.println("변경 전: " + num);
		change(num);
		System.out.println("변경 후: " + num);
		
	}

}
