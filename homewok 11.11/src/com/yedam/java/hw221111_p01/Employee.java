package com.yedam.java.hw221111_p01;

public class Employee {

	//필드
	
	public String name;
	
	public int salary;
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	
	
	
	//메소드
	public void getInformation() {
		System.out.println("이름 : "+ name);
		System.out.println("연봉 : " + salary);
	}
	public void print() {
		System.out.println("수퍼클래스");
	}
	
	
}
