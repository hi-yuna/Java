
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 묵시적 형 변환 => 작은 타입은 큰 타입으로 자동 형변환 가능
		
		short s = 12;
		int n = s;
		System.out.println(n);
		
		char c = 'A';  // 'A' => 정수형(65)
		int n2 = c + 1;
		System.out.println(n2);
		
		int x = 123;
		float y = x + 12.3F;
		System.out.println(y);
		
	}

}
