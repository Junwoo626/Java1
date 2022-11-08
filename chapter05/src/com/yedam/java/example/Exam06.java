package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int[] scores = null;
		int studentNum = 0;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = Integer.parseInt(sc.nextLine());
			//int[] scores = null; => 범위가 스위치문 까지기때문에 다시 초기화
			//while문을 나가도 그 변수값을 가지고싶으면 while문 밖에 변수 생성
			
			//변수의 사용범위 = 가장까가운 중괄호 안에서만 사용가능
			
			//스위치 문을 사용하기 위해서는 boolean타입을 사용해야한다.
			
			switch(selectNo) { //반복문안에서 switch는 사용하지않는것을 권함 or 스위치를 종료하는
			case 1:
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.print("score[" + i + "]> ");
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
				break;
			case 3:
				for(int i=0; i<scores.length; i++) {
					System.out.printf("score[%d] : %d\n", i, scores[i]);
				}
				break;
			case 4:
				int sum = 0;
				int max = scores[0];
				for(int i=0; i<scores.length; i++) {
					//최고점수
					if(max < scores[i]) {
						max = scores[i];
					}
					//총합
					sum += scores[i];
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 : " + ((double)sum / scores.length)); //정수를 나눌때 소수점 표시하고싶으면 둘중하나 실수로 표기해주면 됨
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 입력해주세요.");
			}
			

		}
		System.out.println("프로그램 종료");
		
		
	}
}
