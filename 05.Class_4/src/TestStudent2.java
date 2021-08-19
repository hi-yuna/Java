
public class TestStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1 = new Student();
		System.out.println(stu1.name + "\t" + stu1.age + "\t" + stu1.address);

		Student stu2 = new Student();
		stu2.name = "나나나";
		stu2.age = 10;
		stu2.address = "서울";
		System.out.println(stu2.name + "\t" + stu2.age + "\t" + stu2.address);
		
	}

}
