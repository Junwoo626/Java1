package com.yedam.java.example;

import java.util.Scanner;

public class ExeApp {
	
	Scanner sc = new Scanner(System.in);
	Bank[] Bary = null;
	int menuNo;
	
	public ExeApp() {
		while (true) {
			
			showMenu();
			System.out.println("메뉴 선택 > ");
			menuNo = Integer.parseInt(sc.nextLine());
			
			switch(menuNo) {
			case 1:
				setSize();
				break;
			case 2:
				setInfo();
				break;
			case 3:
				
				break;
			case 4:
				showInfo();
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			}
				
			
			
			
			
		}
		
	}
	
	// 메뉴 출력
	public void showMenu() {
		System.out.println("==============================================================");
		System.out.println("| 1. 회원 수 입력 2. 입력 3. 단건 조회 4. 모두 조회 5. 삭제 6. 종료  |");
		System.out.println("==============================================================");
	}
	
	public void setSize() { // 1. 회원 수 입력
		// 회원 수를 입력받아서 배열의 크기 지정
		System.out.println("회원의 수 >");	
		int count = Integer.parseInt(sc.nextLine());
		Bary = new Bank[count];
	}
	
	public void showInfo() {
		for (int i = 0; i < Bary.length; i++) {
			// 들어간 데이터를 확인하는 과정
			Bary[i].getInfo();
		}
		
	}
	
	// 회원 정보 입력
	public void setInfo() { // 2. 입력
		// 배열 크기만큼 반복문을 실행
		// 회원 정보를 객체 담아서 배열에 저장
		for (int i = 0; i < Bary.length; i++) { // 배열의 길이만큼 반복문을 돌려서 new Bank배열 안에 채워넣음
			
			// 빈 깡통
			Bank bank = new Bank(); // 밖에다 쓰면 덮어쓰기만됨.(위치 중요) 클래스를 넣어주는것
			
			// 1. 계좌 번호 입력
			System.out.println("계좌 번호 >");
			// 계좌번호를 입력하게되면
			int account = Integer.parseInt(sc.nextLine());
			// 빈 깡통(account)에 데이터를 넣음
			bank.setAccount(account);
			
			// 2. 은행 이름 입력
			System.out.println("은행 입력 >");
			String bName = sc.nextLine();
			bank.setBank(bName);
			
			// 3. 예금
			System.out.println("금액 설정 >");
			int money = Integer.parseInt(sc.nextLine());
			bank.setMoney(money);
			
			// 4. 고객 이름 입력
			System.out.println("고객 이름 >");
			String name = sc.nextLine();
			bank.setName(name);
			// --------------------------------------------------
			// bank 객체 ( 계좌번호, 은행이름, 예금, 고객 이름) ->다들어간 데이터을 Bary[i]로 옮겨줌
			Bary[i] = bank;
		}
	}
}
			
			
			

