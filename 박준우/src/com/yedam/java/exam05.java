package com.yedam.java;

import java.util.Scanner;

public class exam05 {
	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int[] diceList = null;
		int count = 0;

		int dice1 = 0;
		while (run) {
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료 ===");
			System.out.print("메뉴 > ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.print("주사위 크기 >");
				dice1 = Integer.parseInt(sc.nextLine());
				if (dice1 >= 5 && dice1 <= 10) {
					System.out.println("");
				} else {
					System.out.println("주사위 크기(5~10)를 다시 입력해주세요.");
				}
			} else if (selectNo == 2) {
				int cnt = 0;
				while (true) {
					int x = (int) (Math.random() * 6) + 1;
					cnt++;
					if (x == 5) {
						break;
					}
					System.out.println(x + "가 나올 때까지 주사위를" + cnt +"번 굴렸습니다.");
				}
				
				

					

			} else if (selectNo == 3) {
				int cnt = 0;
				while (true) {
					int x = (int) (Math.random() * 6) + 1;
					cnt++;
					if (x == 5) {
						break;
					}
					System.out.println(x + "은" + cnt +"번 나왔습니다.");
				}

				int dice = (int) (Math.random() * 6) + 5;
			} else if (selectNo == 4) {
				
				int max = diceList[0];
				int min = diceList[0];
			

			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("메뉴번호를 입력해주세요.");
			}

		}
		System.out.println("프로그램 종료");
	}
}
