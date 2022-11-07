package com.yedam.java.ch0401;

public class ConditionalStatementExample {
	public static void main(String[] args) {
		//기본 IF문
		int score = 80;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		System.out.println("if문 상관없이 실행됩니다.");
		
		//한줄까지는 중괄호가 생략되어도 묶여짐
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
			
		//IF~ELSE 문
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
			
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
			
		//IF~ELSE IF~ELSE 문
		if(score >= 90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		}else if(score >= 80) { // score < 90 && score >= 80
			System.out.println("점수가 89~80입니다.");
			System.out.println("등급은 B입니다.");
		}else if(score >= 70) { // score < 80 && score >= 70
			System.out.println("점수가 79~70입니다.");
			System.out.println("등급은 C입니다.");
		}else { // score < 70
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		
		/* 
		 1) 0.0 <= Math.random() < 1.0
		 2) 0.0 * 10 <= Math.random() * 10 < 1.0 * 10
		 3) (int) 0 <= (int)(Math.random() * 10) < (int) 10
		 4) (int) 0 + 1 <= (int)(Math.random() * 10 + 1 < (int) 10 + 1
		 5) 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		 
		 => (int)(Math.random() * count) + start;   => count는 뽑는 횟수 주사위 3번이면 count는 3
		 */
		
		int num = (int)(Math.random() * 6) + 1;
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		}else if(num == 6) {
			System.out.println("6번이 나왔습니다.");
		}
		
		//switch문
		num = (int)(Math.random() * 6) + 1;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default :     //그 외일때
			System.out.println("6번이 나왔습니다.");
		}
		
		// break문이 없는 case
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재 시각 : " + time + "시");
		
		switch(time) {
		// default를 제외한 나머지 구문에는 break를 달아줘야 빠져나감, break가 없으면 모든 구문 출력
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		
		// char 타입의 switch문
		// 쇼핑몰 : 우수회원 - A / 일반회원 - B / 손님
		
		char grade = 'B';
		
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("우수 회원입니다.");
			break;
			
		case 'B' :
		case 'b' :
			System.out.println("일반 회원입니다.");
			break;
		default : 
			System.out.println("손님입니다.");
		}
		
		//String 타입의 switch문
		String position = "과장";
		
		switch(position) {
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		default :
			System.out.println("300만원");
			
		}
	}
}
}	
	
