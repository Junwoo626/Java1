package com.yedam.java.ch0402;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		// for문

		// 1부터 10까지 출력
		for (int i = 1; i <= 10; i++) { // 초기화 종료조건 증감연산자
			System.out.println(i);
		}

		int x = 1;
		for (; x <= 100; x += 15) {
			System.out.println("출력");
		}
		System.out.println("x : " + x);

		for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
		}

		// 1~100까지 출력, 동시에 1~100까지 합을 출력
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum = sum + i; // sum += i ;
		}
		System.out.println("1~100까지의 합계 : " + sum);

		// float 타입 카운터 변수
		// int로 만든뒤 사용
		for (float f = 0.1F; f <= 1.0F; f += 0.1F) {
			System.out.println(f);
		}

		// 반복문 중첩사용가능
		// 구구단을 2~9단까지 출력

		for (int i = 2; i <= 9; i++) {
			System.out.println("***" + i + " 단 ***");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}

		// while문 =>조건식밖에 없음

		// 1 ~ 10까지 출력

		int count = 1;
		while (count <= 10) {
			System.out.println(count); // 증감은 출력문 뒤
			count++; // 증감은 왠만하면 제일 마지막에 사용
		}
		count = 0;
		while (count <= 9) { // 10으로 두면 11까지 출력됨
			count++; // 증감식을 두는 위치에따라 조건과 출력값이 달라짐
			System.out.println(count); // 증감은 출력문 뒤
		}

		// 1 ~ 100 까지 출력, 1부터 100까지 합을 출력
		sum = 0;
		count = 1;
		while (count <= 100) {
			System.out.println(count);
			sum += count;

			count++;
		}
		System.out.println("1~" + (count - 1) + "까지 합 : " + sum);

		// 주사위 2개를 굴렸을 때, 합이 3일 경우 계속 굴리는 경우

//		int a = (int) (Math.random() * 6) + 1;
//		int b = (int) (Math.random() * 6) + 1;
//		plus = a + b;
//		
//		while( plus != 3) {
//			System.out.println("주사위를 다시 굴립니다");
//		}

		int index = 1;

		while (index != 1) {
			System.out.println("while 반복문이 " + index + "번 실행됩니다.");
		}

		do {
			System.out.println("do ~ shile 반복문이 " + index + "번 실행됩니다.");
		} while (index != 1);

		// break로 while문 종료 (while문에 break를 많이씀)
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6)
				break;
		}

		System.out.println("--------------------------------");

		// 이중 for문에서 break문 사용
		for (char upper = 'A'; upper <= 'Z'; upper++) {

			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {

					break;
				}
			}
			System.out.println("1) 안쪽 for문 종료");

		}
		System.out.println("2) 바깥쪽 for문 종료");

		System.out.println("--------------------------------");
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) { //바깥족 for문 먼저)
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
			System.out.println("1) 안쪽 for문 종료");
		}
		System.out.println("2) 바깥쪽 for문 종료");
		
		// continue를 사용한 for문
		for(int i=1; i<=10; i++) {
//			if(i%2 != 0) {
//				System.out.println(i);
//			}
			if(i % 2 == 0) continue;
			System.out.println(i);
		}

	}
}
