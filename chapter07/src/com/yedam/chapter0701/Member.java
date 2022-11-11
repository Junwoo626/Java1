package com.yedam.chapter0701;

public class Member extends People {

	public int stdNo;
	
	public Member(String name, String ssn, int stdNo) {
		super(name, ssn); // super -> 부모클래스의 생성자를 호출
		this.stdNo = stdNo;
		
	} 

}
