package com.yedam.java.ch0601;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String confirm;
		
		Customer customer = new Customer("고길동", "농협", 123456888, 1000000);
		
		customer.getInfo();
		
		customer.withDraw();
		System.out.println("출금 하시겠습니까? Y/N");
		
		confirm = sc.nextLine();
		if(confirm.toLowerCase().equals("y")) {
			
			System.out.println("출금 완료");
			
		} else {
			System.out.println("시스템 종료");
		}
		
		Access access = new Access();
		
//		//1) public
//		access.free = "public";
//		access.free();
//		//2) private
//		//access.privacy = "privacy";
//		//access.privacy();
//		//3) protected
//		access.parent = "parent";
//		//4) default
//		access.basic = "basic";
		
		
						//singleton == new Singleton();
		Singleton s1 = Singleton.getInstance(); //new Singleton()
		Singleton s2 = Singleton.getInstance();
		//singleton s1 == new Singleton()
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		//singleton == new Singleton()
		//getInstance() == singleton == new Singleton()
		// p -> q , q -> r , r -> p
		//getInstance() == new Singleton()
		
		
		Member mem = new Member();
		
		//1) mem의 인스턴스 필드에 접근 가능한지 확인
		//2) setter, getter로 데이터 입력 및 출력
		mem.setId("yedam");
		mem.setTel("010-1234-1234");
		mem.setAge(10);
		
		System.out.println("ID : " + mem.getId());
		System.out.println("Tel : " + mem.getTel());
		System.out.println("Age : " + mem.getAge());
		
		
		
		
	}
}
