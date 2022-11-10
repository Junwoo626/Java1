package com.yedam.java.ch0601;

public class Person {

	//한국국적을 가진
	final String nation = "korea";
	final String ssn; //생성자를 통해서
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
}
