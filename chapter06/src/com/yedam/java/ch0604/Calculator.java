package com.yedam.java.ch0604;

public class Calculator {

	void powerOn() { //전원버튼 리턴되는게 없으니 void, 매개변수도 비워둠
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y){ //리턴하는 값이 보이드가 아니면 넣어야될것
		int result = x + y;
		return result;  // int가 말하는게 return result
						// 리턴타입에 따라서 리턴하는 값이 달라짐
	}
	
	double divide(int x, int y){
		double result = (double)x / (double)y; //결과를 실수로 나타내고 싶으면 둘다 실수로 하든 한개로 하든 해야함
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//
	double avg(int x, int y){
		int sum = plus(x, y);
		double result = sum / 2.0;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		println("실행결과 : " + result);
		
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	//사각형의 넓이 구하기
	//정사각형 4면이 동일
	double areaRectangle(double width) {
		return width * width;
	}
	// 직사각형 마주보는 두 면만 동일
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	
	
	
	
	
	
}
