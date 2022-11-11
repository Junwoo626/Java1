package com.yedam.chapter0701;

public class Child extends Parent{  //extends + 부모클래스

	//필드
	public String lastName;
	public int age;
	//생성자
	
	//메소드
	
	@Override //컴파일할때 자바에게 알려줌 
	public void method1() { //메소드명 리턴타입 매개변수 다 부모와 같아야함(시그니처)
		System.out.println("Child 클래스 재정의 된 method1 호출");
	}
	
	public void method3() {
		System.out.println("Child 클래스 method3 호출");
	}
	
	
	
}
