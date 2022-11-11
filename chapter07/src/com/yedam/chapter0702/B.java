package com.yedam.chapter0702;

public class B extends A{
	public static void main(String[] args) {
		B b = new B(); // 각각의 개체를 만들어줌
		C c = new C();
		// c -> b 상속 관계 (c:자식 b:부모)
		// b -> a 상속 관계 (b:자식 a:부모)
		// c -> b -> a 상속 관계 (c:손자 b:아빠 a:할아버지)
		
		A a1 = b;
		A a2 = c; 
	}
}
