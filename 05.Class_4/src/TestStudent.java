
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체생성
		Student stu = new Student("홍길동");// 매개변수 1개짜리 생성자를 사용해서 객체 생성 후 초기화

		// 객체사용
		System.out.println(stu.name + "\t" + stu.age + "\t" + stu.address);

		// 학생 2번 객체생성
		// 기본생성자 호출하나 Student에는 매개변수 1개짜리
		Student stu2 = new Student();
		// 생성자만 있고 기본생성자가 없어 에러가 남.
		System.out.println(stu2.name + "\t" + stu2.age + "\t" + stu2.address);

	}

}
