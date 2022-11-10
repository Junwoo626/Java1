package com.yedam.java.ch0601;

public class Application1 {
	
	//필드
	int staticTest = 0;
	
	
	public static void main(String[] args) {
		//내 자신을 하나의 인스턴스로 만들어서 씀
		
		Application1 ap = new Application1();
		
		ap.staticTest = 2;  // 이렇게해야 쓸수있음
		
		Shoes shoes = new Shoes();
		
		shoes.makeRunning();
		shoes.makeSlipper();
		shoes.makeMule();
		shoes.getCount();
		
		System.out.println(Shoes.totalCount);
		
		ConstantNo csno = new ConstantNo(); //인스턴스화 시킴
		System.out.println(csno.word);
		System.out.println(csno.words);
		
		//
		System.out.println(ConstantNo.EARTH_ROUND);
		
		//은행 고객 정보를 관리하는 클래스
		//1) main 2) Customer 3) Bank
		//1) main -> 생성자를 통한 고객의 정보를 저장, 출력
		//2) Bank -> 해당 은행의 금리를 저장
		//   (현재 잔액 + (현재 잔액 * 금리))
		//3) Customer -> 고객의 정보를 저장
		//이름, 은행명, 계좌, 잔액의 필드
		//getInfo() : 입력한 정보를 출력
		//withDraw() : 출금 할 때 정보를 출력
		
		
		
	}
}
