package com.yedam.chapter0801;

public class WashingExample {

	public static void main(String[] args) {
		
		washing(new LGWashingMachine());
//		washing(new SamsungWashingMachine()); // -> 개발 코드를 수정하지 않고 객체교환
	}
	
	public static void washing(WashingMachine wm) {
		wm.startBtn();
		System.out.println("세탁기 속도는 " + wm.changeSpeed(3));
		wm.stopBtn();
	}
}
