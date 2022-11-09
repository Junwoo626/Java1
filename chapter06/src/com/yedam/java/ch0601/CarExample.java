package com.yedam.java.ch0601;

public class CarExample {

		public static void main(String[] args) {
			Car car1 = new Car();
			System.out.println("최대 스피드 : " + car1.maxSpeed);
			System.out.println("색깔 : " + car1.color);
			car1.run();//함수를 출력하는거기때문에 괄호 필요
			
			System.out.println();
			
			Car car2 = new Car();
			System.out.println("최대 스피드 : " + car2.maxSpeed);
			System.out.println("색깔 : " + car2.color);
			car2.run();
			
			System.out.println();
			if(car1 == car2) {
				System.out.println("car1과 car2는 동일한 객체를 참조합니다.");
			}else {
				System.out.println("car1과 car2는 서로 다른 객체를 참조합니다."); // new 연산자는 같은객체를 참조해도 새로운 객체를 만들어냄
			}
			
		}
}
