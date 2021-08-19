
public class Student {

	String name;
	int age;
	String address;

	public Student() {
		super();
		System.out.println("기본 생성자 호출!");
	}

	public Student(String n) { 
		System.out.println("매개변수 1개짜리 생성자 호출!");
		name = n;// 멤버변수 name을 매개변수 값으로 초기화
	}

}
