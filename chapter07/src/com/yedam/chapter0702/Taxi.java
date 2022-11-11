package com.yedam.chapter0702;

public class Taxi extends Vehicle{

	
	@Override //명시적으로 적어놓는거지만 안적어도 상관없음
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
