package com.yedam.java.ch0601;

public class Singleton {		//static은 모든곳에 접근한데 private는 접근 불가능
	
	//전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩 기법
//	private static Singleton singleton = new Singleton(); // <- 이 줄이 '단 하나의 객체'
							 //singleton = new Singleton();
	
	private static Singleton singleton = null;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			return singleton = new Singleton();
		} else {
			return singleton;
		}
	}
	
	
//	public static Singleton getInstance() {
//		
//		return singleton;
//			//singleton = new Singleton();
//	}
	
	public void run() {
		System.out.println("싱글톤이 작동중입니다.");
	}
	public void connectDB() {
		System.out.println("데이터베이스를 연결합니다.");
	}
}
