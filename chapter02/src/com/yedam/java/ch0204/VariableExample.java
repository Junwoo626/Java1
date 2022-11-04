package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariableExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); //자리(숫자)는 기본으로 채워줘야함
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.println(area);
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		Scanner sc = new Scanner(System.in);
		//ctrl + shift + o => java.util.Scanner (import 있어야 스캐너 사용가능)
		
//		String str = sc.nextLine(); //엔터값까지 (한줄로보고) 읽어들임, nextLine =>무조건 단독으로 써야함
//		System.out.println("입력 : " + str);
		
//		String str = sc.next(); // 얘는 엔터를 읽어들이지 않음 next, nextLine 동시 출력 불가능
//		int var = sc.nextInt(); // 뒤에 nextLine이 있으면 nextLine이 남아있는 엔터값을 읽고 넘어감
//		System.out.println("입력 : " + str + ", " + var);
		
		
//		System.out.print("첫번째 : ");
//		String x = sc.nextLine();
//		System.out.print("두번째 : ");
//		String y = sc.nextLine();
//		int result = Integer.parseInt(x) + Integer.parseInt(y);
//		System.out.println("결과 : " + result);
		
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		System.out.println("입력 : " + (x+y)); //공백을 두고 입력해야함
		
		//반복문
		String inputData;
		
		while(true) {
			inputData = sc.nextLine();
			System.out.printf("입력된 문자열: %s\n", inputData);
			if(inputData.equals("exit")) {
				break;
			}
		}
		System.out.println("종료");
	}
}
