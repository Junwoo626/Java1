package com.yedam.java.ch0601;

public class Game {
	
	
	//인스턴스 필드 + 인스턴스 메소드 = 인스턴스 멤버
	
	//필드
	//객체로 만든다(인스턴스화로 된다)
	//인스턴스 필드
	static String gameName = "마인크래프트";
	static String server = "한국";
	static String id;
	static String passWd;
	
	//생성자
	public Game() { //생성자 오버로딩 -> 매겨번수에 따라 인식을 다르게한다
		
	}
	public Game(String id) {
		this.id = id;
	}
	public Game(String id, String passWd) {
		this.id = id;
		this.passWd = passWd;
	}
	//메소드
	//인스턴스 메소드
	void getInfo() {
		System.out.println("GameName : " + gameName );
		System.out.println("id : " + id);
		System.out.println("password : " + passWd);
	}
	void getInfo(String temp) {
		
	}
}
