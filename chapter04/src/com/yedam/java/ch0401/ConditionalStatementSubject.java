package com.yedam.java.ch0401;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		// 문제1 ) 두 개의 정수가 주어졌을 때
		// 두 정수의 합이 자연수이면
		// 'Natural Number'를 출력하는 코드를 작성하세요.

		int a = (int) (Math.random() * 10) - 5;
		int b = (int) (Math.random() * 10) - 5;

		if (a + b > 0) {
			System.out.println("Nautral Number");
		}

		// 문제2 ) 두 개의 정수가 주어졌을 때
		// 두 수의 대소관계에 따라서 부등호를 출력하는 코드를 작성하세요.

		int c = (int) Math.random();
		int d = (int) Math.random();

		if (c > d) {
			System.out.println(">");
		} else if (c == d) {
			System.out.println("=");
		} else {
			System.out.println("<");
		}

		// 문제3 ) 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분
		// BMI = 체중(kg) / (키(m) * 키(m))
		// 저체중(18.5 미만), 정상(18.5 이상 25 미만),
		// 과체중(25이상 30미만), 비만(30이상)

		double w = (double) 93.0;
		double h = (double) 1.82;
		double i = w / (h * h);

		if (i < 18.5) {
			System.out.println("저체중");
		} else if (i < 25.0) { // i >= 18.5 && i < 25.0
			System.out.println("정상");
		} else if (i < 30.0) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		// 범위는 스위치문 x , 정해진 변수가 있을경우에만 스위치문 가능

		// 문제4) 선택한 단의 6번째 값을 출력하는 코드
		// 예를 들어, 2단일 경우 2 X 6 = 12
		// 단, 출력문에는 변수를 사용하지 않는다.

		int y = (int) (Math.random() * 9) + 1;

		switch (y) {
		case 1:
			System.out.println("1 X 6 = 6");
			// System.out.printf("%d X 6 = %d\n", 1, 1*6); 으로도 가능
			break;
		case 2:
			System.out.println("2 X 6 = 12");
			// System.out.printf("%d X 6 = %d\n", 2, 2*6);
			break;
		case 3:
			System.out.println("3 X 6 = 18");
			// System.out.printf("%d X 6 = %d\n", 3, 3*6);
			break;
		case 4:
			System.out.println("4 X 6 = 24");
			// System.out.printf("%d X 6 = %d\n", 4, 4*6);
			break;
		case 5:
			System.out.println("5 X 6 = 30");
			// System.out.printf("%d X 6 = %d\n", 5, 5*6);
			break;
		case 6:
			System.out.println("6 X 6 = 36");
			// System.out.printf("%d X 6 = %d\n", 6, 6*6);
			break;
		case 7:
			System.out.println("7 X 6 = 42");
			// System.out.printf("%d X 6 = %d\n", 7, 7*6);
			break;
		case 8:
			System.out.println("8 X 6 = 48");
			// System.out.printf("%d X 6 = %d\n", 8, 8*6);
			break;
		default:
			System.out.println("9 X 6 = 54");
			// System.out.printf("%d X 6 = %d\n", 9, 9*6);
		}

		// 문제5) 다음과 같이 점수 범위에 따라 등급을 구분
		// 해당 점수에 대한 등급을 출력하는 코드
		// 90점 이상 100점 이하 : A등급,
		// 80점 이상 90점 미만 : B등급,
		// 70점 이상 80점 미만 : C등급,
		// 60점 이상 70점 미만 : D등급,
		// 60점 미만 : E등급

		int s = (int) (Math.random() * 101);
		int p = s / 10;
		switch (p) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("E등급입니다");
			break;
		case 6:
			System.out.println("D등급입니다.");
			break;
		case 7:
			System.out.println("C등급입니다.");
			break;
		case 8:
			System.out.println("B등급입니다");
			break;
		default:
			System.out.println("A등급입니다");

			double score = 75.6;

			switch ((int) (score / 10)) {
			case 10:
			case 9:
				System.out.println("A등급입니다.");
				break;
			case 8:
				System.out.println("B등급입니다.");
				break;
			case 7:
				System.out.println("C등급입니다.");
				break;
			case 6:
				System.out.println("D등급입니다.");
				break;
			default:
				System.out.println("E등급입니다.");
			}
		}
	}

}
