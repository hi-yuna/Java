
class Man {
	
	String name;
	int age;
	
	public Man(String name) {
		this(name, 10);
		System.out.println("Man 생성자1");
	}
	
	public Man(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Man 생성자2");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man man = new Man("유나");
		System.out.println(man.getName() + " " + man.getAge());
		
	}

}
