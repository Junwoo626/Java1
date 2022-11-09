package com.yedam.java.ch0603;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	
	//생성자 
	// 똑같은 이름의 메소드는 존재할수없음, 하지만 생성자는 가능
//	public Car(String model,String color) { //this는 생성자와 메소드 안에서만 사용가능
//		this.model = model; // 외부에서 클래스를 this -> 클래스를 인스턴스 
//		this.color = color; // 필드값을 대체(위에있는 필드를 건들지않고)
	 //생성자가 있는데 자바가 임의로 생성자를 생성할수 없음
	  //자바가 기본 생성자를 생성하는경우는 생성자를 찾는데 없는경우를 제외하고는 생성자를 생성하지않는다.
		
	public Car() {
		
	}
	
	public Car(String model) { 	//서로다른 생성자끼리는 호출할수있음
		//this.model = model;	//this로해서 생성자를 호출했을 경우에는 값을 반환받기 전까지는 인스턴스 생성이 안됨
		this(model, "은색", 250);
	}
	
	public Car(String model,String color) { 
		//this.model = model;  
		//this.color = color;
//		this.company = "웨스턴"; // this는 첫번째 줄에 있어야함
		this(model, color, 250);
	}
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
	


