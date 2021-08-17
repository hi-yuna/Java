
public class TestStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 첫번째 학생
		Student stu1 = new Student();
		stu1.name = "유재석";
		stu1.age = 20;
		stu1.address = "서울";

		System.out.println("첫번째 학생 이름: " + stu1.name);
		System.out.println("첫번째 학생 나이: " + stu1.age);
		System.out.println("첫번째 학생 주소: " + stu1.address);

		// 두번째 학생
		Student stu2 = new Student();
		stu2.name = "강호동";
		stu2.age = 21;
		stu2.address = "경상도";

		System.out.println("두번째 학생 이름: " + stu2.name);
		System.out.println("두번째 학생 나이: " + stu2.age);
		System.out.println("두번째 학생 주소: " + stu2.address);
		
	}

}
