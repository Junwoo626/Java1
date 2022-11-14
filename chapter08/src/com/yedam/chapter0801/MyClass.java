package com.yedam.chapter0801;

public class MyClass {
	
	//필드
	//1)
	// public int a = 1;
	RemoteControl rc = new Television(); //참조타입도 넣을수 있음
	
	//생성자
	public MyClass() {       // 생성자 오버로딩
		
	}
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
	
	
}
