package com.yedam.java.hw221111_p01;

public class EmpDept extends Employee{

	public String depart;
	
	public String getDepart() {
		return depart;
	}

	
	public EmpDept(String name, int salary, String depart) {
		super(name,salary);
		
		this.depart = depart;
	}
	
	public void getInformation() {
		super.getInformation();
		System.out.println("부서 : " + depart);
	}
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
}
	
	

	
