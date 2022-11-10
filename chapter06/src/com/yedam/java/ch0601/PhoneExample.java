package com.yedam.java.ch0601;

public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone iphone14Pro = new SmartPhone("iphone14Pro"); 	// 스마트폰 클래스의 정보를 불러옴 
												   	// new -> 클래스를 사용해서 객체를 만들어내는 연산자
												   	//        공간을 할당해서 만들어줌
		iphone14Pro.maker = "Apple";				
			//닷연산자 -> 클래스 필드에 접근 (이용해서 데이터를 넣을수도 꺼내올수도 있음)
		iphone14Pro.name = "iphone14Pro";
		iphone14Pro.price = 1000000;
		
		System.out.println("나의 핸드폰은 " + iphone14Pro.maker + " 입니다.");
		System.out.println("나의 핸드폰 기종은 " + iphone14Pro.name + "입니다.");
	
		iphone14Pro.call();
		iphone14Pro.hangUp();
		
		SmartPhone zflip4 = new SmartPhone("zflip4");
		
		System.out.println("객체 생성시 생성자에 초기값을 안 넣어준 경우");
		System.out.println(zflip4.name); // 초기값을 안넣어준경우 null이 나옴
		
		zflip4.name = "zflip4";
		zflip4.maker = "samsung";
		zflip4.price = 900000;
		
		
		//바로 메소드 호출
		zflip4.call();
		zflip4.hangUp();
		
		//들어가있는지 확인
		System.out.println(iphone14Pro);
		System.out.println(zflip4);
		
		
		/*com.yedam.java.ch0601.SmartPhone@5aaa6d82   @뒤에 있는 건 데이터가 위치한 주소
    	com.yedam.java.ch0601.SmartPhone@73a28541 */
		//String -> 데이터주소를 넣어주는것
	}
}
