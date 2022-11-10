package com.yedam.java.ch0601;

public class SmartPhone {

	// 필드
	// 해당 클래스의 속성(정보) 저장하는 구간
	String name;
	String maker;
	int price;
	
	// 생성자
	public SmartPhone(String name) {
		this.name = name;
	}
	
	
	
	// 메소드
	void call() {
		//전화를 거는 기능, 전화를 끊는 기능
		System.out.println(name + "전화를 겁니다."); //필드의 객체를 가지고옴
	}
	
	void hangUp() {
		System.out.println(name + "전화를 끊습니다.");
	}
}
