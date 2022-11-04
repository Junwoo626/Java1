package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
		// 부호연산자
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result : " + result1);
		System.out.println("result : " + result2);
		
		byte b = 100; // int밑에 있는 경우
//		byte result3 = (byte)-b; //byte값으로 받고싶으면 캐스팅괄호 byte 써줘야함
		int result3 = -b; //캐스팅괄호로 하지않으면 무조건 int값으로
		System.out.println("result3 : " + result3);
		
		// 증감연산자
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------------------");
		x++;	// 11
		++x;	// 12
		System.out.println("x = " + x);
		
		System.out.println("----------------------------");
		y--;	//9
		--y;	//8
		System.out.println("y = " + y);
		
		System.out.println("----------------------------");
		z = x++; // ++ => 다른연산이 다진행된후에 적용됨
		System.out.println("z = " + z);	// 12
		System.out.println("x = " + x);	// 13
		
		System.out.println("----------------------------");
		z = ++x; // 앞에 있는 증감은 먼저 적용시키고 대입연산자 진행
		System.out.println("z = " + z);	// 14
		System.out.println("x = " + x);	// 14
		
		System.out.println("----------------------------");
		z = ++ x + y++; // 15 = 15 + 8++
		// 1) ++x => 15
		// 3) y++  => 9
		// 2) x + y => 15 + 8 => 23
		// 4) =  => z = (x + y) => z = 23
		System.out.println("z = " + z);	// 23
		System.out.println("x = " + x);	// 15
		System.out.println("y = " + y);	// 9
		
		/***/
		x = 5;
		y = 5;
		System.out.println("----------------------------");
		z = x++ + --y;
		// 1) --y    => 4
		// 2) x + y  => 5 + 4 => 9
		// 3) x++    => 6
		// 4) z = x + y  => z = 9
		System.out.println("z = " + z); // 9
		System.out.println("x = " + x); // 6
		System.out.println("y = " + y); // 4
		
		System.out.println("----------------------------");
		z = --x + y++;
		// 1) --x    => 5
		// 2) x + y  => 5 + 4 => 9
		// 3) y++    => 5
		// 4) z = x + y  => z = 9
		System.out.println("z = " + z); // 9
		System.out.println("x = " + x); // 5
		System.out.println("y = " + y); // 5
		
		// 논리 부정 연산자
		boolean play = true;
		System.out.println(play);
		
		play /*true*/= !play; 
		System.out.println(play);
		
		play /*false*/= !play; 
		System.out.println(play);
		
		boolean isOpen = true;
		
		if(!isOpen) { // ! => if문과 많이 쓰임
			System.out.println("영업시간이 종료되었습니다.");
		}else {
			System.out.println("영업 중입니다.");
			
		// 산술 연산자
		int v1 = 5;
		int v2 = 2;
		
		int result;
		result = v1 + v2;
		System.out.println("result : " + result);
		
		result = v1 - v2;
		System.out.println("result : " + result);
		
		result = v1 * v2;
		System.out.println("result : " + result);
		
		result = v1 / v2;
		System.out.println("result : " + result);
		
		result = v1 % v2;
		System.out.println("result : " + result);
		
		// 비교 연산자
		int num1 = 10;
		int num2 = 10;
		boolean bResult;
		
		bResult = ( num1 >= num2 );
		System.out.println(">= : " + bResult); //true
		
		bResult = ( num1 == num2 );
		System.out.println("== : " + bResult); //true
		
		bResult = ( num1 != num2 );
		System.out.println("!= : " + bResult); //false
		
		char char1 = 'A'; //65
		char char2 = 'B'; //66
		System.out.println("문자 비교 : " + (char1 > char2));
		
		int v3 = 1;
		double v4 = 1.0;
		System.out.println("int VS double : " + (v3 == v4));
		
		float v5 = 0.1F;
		double v6 = 0.1;
		System.out.println("float VS double : " + (v5 == v6)); //정밀도가 다르기때문에 false
		//정수는 상관없지만 float 과 double을 비교할때에는 같은 변수로 맞춰줘야한다
		System.out.println("float VS float : " + (v5 == (float)v6));
		
		// 논리 연산자
		int charCode = 'A';
		
		// 유니코드 중 65보다 크거나 같고 90보다 작거나 같으면 대문자
		if((charCode >= 65) && (charCode <= 90)) { //논리비교식으로 많이 쓰는건 &&(2개)이다
			System.out.println("대문자");
		}
		
		//유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
		if((charCode >= 97) & (charCode <= 122)) { //&,&& 역할자체는 같지만 
			System.out.println("소문자");
		}
		
		//유니코드 중 48보다 크고 57보다 작으면 숫자 0~9
		if((charCode > 48) && (charCode <57)) {
			System.out.println("숫자 0~9");
		}
		
		int numValue = 6;
		
		if((numValue % 2 == 0)||(numValue % 3 == 0)) { //한개일때는 두개 모두 검사 두개일때면 앞에 하나먼저 검사 
			System.out.println("2 또는 3의 배수군요.");
		}
		
		// 복합 대입 연산자
		int resultA = 0;
		resultA += 10;	// resultA = resultA + 10
		System.out.println("+= : " + resultA);
		resultA -= 5;	// resultA = resultA - 5
		System.out.println("-= : " + resultA);
		resultA *= 3;	// resultA = resultA * 3
		System.out.println("*= : " + resultA);
		resultA /= 5;	// resultA = resultA / 5
		System.out.println("/= : " + resultA);
		resultA %= 3;	// resultA = resultA % 3
		System.out.println("%= : " + resultA);
		
		
		// 삼항연산자 : 값을 반환하는 조건문
		int score = 85;
		char grade = (score> 90)? 'A'/*true*/ : 'B'/*false*/ ;
		System.out.printf("성적은 %d이고 등급은 %c 입니다. \n" , score, grade); // %c 는 캐릭터에 대응
		//println을 제외하고는 자동으로 줄바꿈이 안됨
		
		int age = 17; //성인 미성년 => 문자이므로 String 사용
		String message = (age >= 20)? "성인" : "미성년" ;
		System.out.printf("나이는 %d살이며 %s입니다.\n", age, message);
		
		
		}
	}

}	
		
		

