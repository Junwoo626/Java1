package com.yedam.java.ch0203;

public class VariableExample {
	public static void main(String[] args) {
		/* 자동 타입 변환 */
		byte byteValue = 10;
//		char charValue = byteValue; //바이트는 캐릭터로 바꿀수 없음
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
		
		// 강제 타입 변환
		intValue = 44032;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		doubleValue = 3.14;
		intValue = (int)doubleValue; //실수에서 정수로 값 변환을 할때 반올림 없이 소수점아래 버리므로 주의!
		System.out.println(intValue);
		
		// 정수 타입 연산
		byte result = 10 + 20;  //리터럴(상수)
		
		byte x = 10;
		byte y = 20;
		//byte result2 = x + y   //변수끼리는 자동으로 연산이 안됨
		int result2 = x + y; //정수로 변환해서 연산
		byte result3 = (byte)( x + y ); //강제로 바이트값으로 변경
		System.out.println(result2 + ", " + result3);
		
		char charValue1 = 'A'; //65
		char charValue2 = 1;
		int intResult = charValue1 + charValue2;
		System.out.println("유니코드 : " + intResult);
		System.out.println("출력문자 : " + (char)intResult);
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long longResult = value1 + value2 + value3; //int 미스매치
		
		int intV1 = 10;
		double doubleV1 = 5.5;
		double plusV1 = intV1 + doubleV1;
		
		/* int intVar1 = 10;
		int resultVar1 = intVar1/4;
		System.out.println("10/4 결과 : " + resultVar1); */
		
		int intVar1 = 10;					//둘중에 하나를 실수로(.0)만들어주면됨
		double resultVar1 = intVar1/4.0;    //10.0 / 4.0 -> 2.5
		System.out.println("10/4 결과 : " + resultVar1);
		
		int x1 = 1;
		int y1 = 2;
		double result1 = (double)x1 / y1; //실수로 출력하려면 한쪽을 실수로 만들어줘야함
		System.out.println("1/2 결과 : " + result1);
		
		// 문자열 결합
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		String str1 = 10 + 2 + "8"; //한글자만 따옴표 붙이면 오류안일어남
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println(str3);
		
		String str4 = "10" + (2 + 8) ; // 괄호로 계산 우선순위 변경
		System.out.println(str4);
		
		// 기본타입 <-> String
		int aVar = Integer.parseInt("10"); //parseInt
		double bVar = Double.parseDouble("101.0");
		boolean cVar = Boolean.parseBoolean("true");
		
		System.out.println("a: " + aVar);
		System.out.println("b: " + bVar);
		System.out.println("c: " + cVar);
		
		String strV1 = String.valueOf(10);
		String strV2 = String.valueOf(3.14);
		String strV3 = String.valueOf(true);
		
		System.out.println(strV1);
		System.out.println(strV2);
		System.out.println(strV3);
		
		String strV4 = "" + 105.23; //문자열은 공백을 인식하기때문에 공백을 넣어서 문자열로 바꿔줌
		System.out.println(strV4);
		
	}
}
