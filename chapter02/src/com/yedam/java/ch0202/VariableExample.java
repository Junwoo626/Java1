package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// byte 타입
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 127;
		//byte var5 = 128;
		System.out.println(var1);
		//System.out.println(var5);
		
		long var6 = 100000000000L; //자바에서 모든 정수값은 int로 인지하기때문에 오류가 나옴
		long var7 = 100000;		   //int를 넘어서는 숫자를 적용할때는 숫자뒤 L적어줌

		//char 타입
		
		char v1 = 'A';  //'',"" 구분 => char에서는 ''사용
		char v2 = '가';
		int v3 = v1; //또다른 정수타입의 값을 옮길수있음
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		// String 일반적
		String name = "홍길동";  // ""=문자열 이터널
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(name.length()); // length => 길이를 반환
		System.out.println(job);
		System.out.println(job.charAt(3)); // 몇번째 값을 반환
		
		// char VS String
		char v4 = 'A';   // ""인지하지못함,무조건 한글자만 입력
		String v5 = "-"; // 한글자만 입력해도 문제되지 않음,특수문자 입력가능, ''인지하지못함		
		
		String str1 = "누군가 \"안녕\"하면서 인사했다."; // 내부에있는 값으로 주고싶으면\(역슬래시)로 감싸줌
												   // 이스케이프 문자
		// float
		float num1 = 3.14F; //F를 붙이지 않으면 인지하지못함
		double num2 = 3.14;
		
		float varF = 0.1234567890123456789F; //근접하도록 변환
		double varD = 0.1234567890123456789;
		
		System.out.println(varF);
		System.out.println(varD);
		
		//boolean => 참이냐 거짓이냐
		
		boolean stop = ( 1 > 2 );
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
	}

}
