
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		
		stu.setName("나유나");
		stu.setAge(25);
		stu.setAddress("광주");
		
		String name = stu.getName();
		int age = stu.getAge();
		String address = stu.getAddress();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		
	}

}
