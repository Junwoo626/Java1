package com.yedam.chapte0703;

public class Application {
	public static void main(String[] args) {
		
		
		//추상 클래스는 자신을 객체화(인스턴스화) 할 수 없다.
		//Phone phone = new Phone("아이폰");
		
//		SmartPhone smartPhone= new SmartPhone("고길동");
//		
//		smartPhone.turnOn();
//		
//		smartPhone.internetSearch();
//		
//		smartPhone.turnOff();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("---------");
		
		Animal animal = null;
		
		animal = new Dog();
		animal.sound();
		
		animal.breathe();
		
		animal = new Cat();
		animal.sound(); //추상클래스라 하더라도 메소드를 사용할수있음
		
		System.out.println("-----------");
		
		animalSound(new Dog()); //new Dog,Cat을 밑에 animal에 보냄
		animalSound(new Cat());
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound(); // 자동 타입변환
	}
	
	
	
}
