package com.yedam.chapter0702;

public class Application3 {
	
	public static void method1(Parent parent) { // <- parent자리에 new Child
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - child 변환 성공");
		}else {
			System.out.println("변환 실패");
		}
		//parent자리에 비교할 타입 
	}
	
	public static void method2(Parent parent) { // <- parent자리에 new Child
		
			Child child = (Child) parent;
			System.out.println("method2 - child 변환 성공");
	}
	
	
	public static void main(String[] args) {
		
		Parent parentA = new Child(); // -> 위 parent로 
		method1(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		
		
		
		
		
		Driver driver = new Driver();
		
		//bus, taxi -> vehicle 부모클래스
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//매개변수 bus,taxi -> vehicle로 대체
		//driver.drive(Vehicle vehicle = new bus)
		driver.drive(bus);
		
		//driver.drive(Vehicle vehicle = new taxi)
		driver.drive(taxi);
		
		Animal animal = null;
		
		animal = new Cat();
		
		animal.speak();
		
		animal = new Dog();
		
		animal.speak();
		
		Parent parent = new Child();
		
		parent.field = "parent";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "child";
//		parent.method3();
		
		//casting
		Child child = (Child)parent;
		
		child.field2 = "parent";
		child.method3();
		
		child.field = "parent";
		
		//하나의 타입으로 여러가지 모양을 만들수있음 -> 다형성
		
	}
}
