package com.test;

class Emp {

	public Emp() {
		super();
		System.out.println("EMP 생성자1");
	}

	public Emp(String name, int salary) {
		System.out.println("EMP 생성자2");
	}

}

class Man extends Emp {

	public Man() {
		super();
		System.out.println("MAN 생성자");
	}

}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man man = new Man();
		
	}

}
