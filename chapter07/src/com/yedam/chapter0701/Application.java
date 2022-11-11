package com.yedam.chapter0701;

public class Application {

	public static void main(String[] args) {
		
//		Child child = new Child();
//		
//		
//		//자식 클래스 고유 필드
//		child.lastName = "paul";
//		child.age = 20;
//		
//		//부모 클래스 필드
//		System.out.println(child.firstName + child.lastName);
//		
////		System.out.println(child.job); //부모에서 job이 private라 상속 x
//		
//		//부모 -> 여러명의 자식 가능
//		//자식 -> 여려명의 부모 불가능
//		//
//		
//		DmbCellPhone dmb = new DmbCellPhone("고아라폰", "화이트", 10);
//		
//		//부모 클래스 필드 사용
//		System.out.println("모델 : " + dmb.model);
//		System.out.println("색상 : " + dmb.color);
//		
//		//자식 클래스 필드 사용
//		System.out.println("채널 : " + dmb.channel);
//		
//		//부모 클래스 메소드 사용
//		dmb.powerOn();
//		dmb.sendVoice("안녕하세요");
//		dmb.receiveVoice("안녕하세요 전 김또치입니다.");
//		dmb.powerOff();
//		
//		//자식 클래스 메소드 사용
//		dmb.turnOnDmb();
//		
//		//부모 객체의 메소드 사용
//		Member member = new Member("고길동", "123123-456456", 1);
//		System.out.println("name : " + member.name);
//		System.out.println("ssn : " + member.ssn);
//		
//		//자식 객체의 필드 사용
//		System.out.println("memberNo : " + member.stdNo);
//		
		//People Member Application
		
		Child cd = new Child();
		
		cd.method1();
		cd.method2();
		cd.method3();
		
		Compute com = new Compute();
		
		double result = com.areaCircle(10);
		
		
		System.out.println("result : " + result);
		
		
//		SupersonicAirPlane sa = new SupersonicAirPlane();
//		
//		sa.takeOff(); //부모
//		
//		sa.fly(); //자식
//		
//		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
//		
//		sa.fly();
//		
//		sa.flyMode = SupersonicAirPlane.NORMAL;
//		
//		sa.fly();
//		
//		sa.land();
		
		Child chd = new Child();
		//Parent parent = new Child();
		//부모 클래스에 있는 필드, 메소드를 사용을 하되 만약 자식 클래스에 오버라이딩이 되어 있는 메소드가 존재한다면
		//부모 클래스에 정의된 메소드를 사용하지 않고 자식 클래스에 있는 메소드를 사용 하는것을 "자동타입변환"이라고 한다.
		
		Parent parent = chd;
		//부모타입에 있는것만 사용가능하기때문에 method3()을 못불러옴 method1은 오버라이딩으로 재정의된 자식클래스것을 들고옴
		//method2()는 부모 클래스에만 있기때문에  
		parent.method1();
		parent.method2();
//		parent.method3();
		
		
		
		
	}

}
