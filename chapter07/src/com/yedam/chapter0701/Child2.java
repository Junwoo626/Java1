package com.yedam.chapter0701;

import com.yedam.chapter07.*;

public class Child2 extends Parent {
	
	//필드
	
	
	//생성자
	
	
	//메소드
	
	void getInfo() {
		System.out.println(firstName + lastName + bloodType + age);
		//default로 정의된애는 사용할수 없음 하지만 protected를 사용하고 자식관계에 있으면 다른 패키지라도 사용할수있음
		//public 사용시 사용가능 -> 하지만 모든곳에서 사용할수있기때문에 조심
	}
	
}
