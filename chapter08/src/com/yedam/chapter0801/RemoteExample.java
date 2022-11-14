package com.yedam.chapter0801;

public class RemoteExample {

	public static void main(String[] args) {
		
		//TV를 객체로 해서 만듦.
		RemoteControl rc = new Television();
		
		//덮어씌움 (Television -> Audio 변경)
		rc = new Audio();
		
		
		
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		
		//쓰기, 읽기, 리스트 조회
		
		
		Television tv = new Television();
		
		tv.turnOn();
		tv.setVolume(11);
		tv.turnOff();
		
		Search search = new Television();
		//원하는 기능만 불려오려면 각각의 인터페이스가 존재해야함
		search.search("google.com");
		
		
		// 추상 클래스 vs 인터페이스
		
		// 추상 클래스(extends, 상속이기때문에 부모하나만 섬김) -> 필드,생성자,메소드 
		
		
		// 인터페이스(implement, 상속을 여러개 받을수 있음) -> 상수, 추상 메소드
		// 기능 위주로 사용할거면 인터페이스 사용
		
		//
		
		
		
		/*
		 * public void temp(RemoteControl rc){  => 
		 * }
		 * 
		 * public void temp(Television tv){
		 * }
		 * 
		 */

	}

}
