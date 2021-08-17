
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student();
		
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		System.out.println(stu1.address);

		Student stu2 = new Student();
		stu2.name = "유유유";
		stu2.age = 30;
		stu2.address = "강원도";
		
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		System.out.println(stu2.address);
		
	}

}
