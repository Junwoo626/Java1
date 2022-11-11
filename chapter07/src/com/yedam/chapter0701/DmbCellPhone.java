package com.yedam.chapter0701;

public class DmbCellPhone extends CellPhone{

	//필드
	public int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		//super(); 생략됨
		//부모 클래스 필드
		this.model = model;    //model,color -> 부모필드에 있는걸 가져온것
		this.color = color;
		//자식 클래스 필드
		this.channel = channel;       
	}
	
	
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	
}
	
	
