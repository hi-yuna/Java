package com.test;

class Employee {

	String name;
	int salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}

class Manager extends Employee {
	String depart;

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Manager [depart=" + depart + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee("나나나", 2000);
		Manager man = new Manager("유유유", 1000, "개발");

		System.out.println(emp.toString());
		System.out.println(man.toString());
		
	}

}
