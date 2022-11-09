package com.yedam.java.ch0604;

public class Car {
	// 필드
	int gas;
	
	// 생성자
	
	
	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;		// 리턴이 있기때문에 if문에서 끝남
		}
		System.out.println("gas가 있습니다.");
		return true;			//
	}
	
//	void run() {
//		while(true) {
//			if(this.gas > 0) {
//				System.out.println("달립니다. (gas 잔량 : " + this.gas + ")");
//				this.gas--;
//			}else {
//				System.out.println("멈춥니다. (gas 잔량 : " + this.gas + ")");
//				return; // 리턴문의 뒤에 있는 구문은 어떠한 경우에도 실행되지않음. 리턴에서 끝이남
//			}
//		}
//	}
	
	void run() {
		while(true) {
			if(isLeftGas()) {
				System.out.println("달립니다. (gas 잔량 : " + this.gas + ")");
				this.gas--;
			}else {
				System.out.println("멈춥니다. (gas 잔량 : " + this.gas + ")");
				return; // 리턴문의 뒤에 있는 구문은 어떠한 경우에도 실행되지않음. 리턴에서 끝이남
			}
		}
	}
	
	
}
