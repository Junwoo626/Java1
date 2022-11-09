package com.yedam.java.ch0502_02;

public class ArrayExample {
	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3]; // 크기를 지정 int[]의 배열 
		                    // 앞자리[] : 값으로가지는 인트배열, 뒷자리[] : 1차원배열의 크기
		
		// 첫번째 : 변수 사용
		
		for(int i=0; i<mathScores.length; i++) {
			System.out.println("mathScore[ "+ i +" ]");
			int[] mathScore = mathScores[i]; // i번째 값을 들고오면 변수타입은 int배열이다
			
			for(int j=0; j<mathScore.length; j++) {
				System.out.print("\t mathScore[" + j + "] ");
				System.out.println(mathScore[j]);
			}
			
		}
			
		System.out.println("-------------------------------------------------------------------------");
		// 두번째 : 변수사용x
		
		
		for(int i=0; i<mathScores.length; i++) {
			System.out.println("mathScores[ "+ i +" ]");
//			int[] mathScore = mathScores[i]; // i번째 값을 들고오면 변수타입은 int배열이다
			
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.print("\t mathScores["+i+"] [" + j + "] : ");
				System.out.println(mathScores[i][j]);
				}
			}
		
		int[][] scoreList = {
								{86, 65},
								{58, 95, 73}
							};
		
		for(int i=0; i<scoreList.length; i++) {
			System.out.println(i + "번째 학생 성적====");
			for(int j=0; j < scoreList[i].length; j++) {
				System.out.print(scoreList[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] englishScore = new int[2][]; //다차원배열에 크기를 줄때 앞[]은 필수로 있어야함. 뒷[]는 유동적으로 정할수있음
		englishScore[0] = new int[3]; // 첫번째칸은 세칸으로 나눈다는 의미
		englishScore[1] = new int[2]; // 두번째칸은 두칸으로 나눈다는 의미
		
		for(int i=0; i<englishScore.length; i++) {
			for(int j=0; j<englishScore[i].length; j++) {
				System.out.print("englishScore["+i+"]["+j+"] : ");
				System.out.println(englishScore[i][j]);
			}
		}
		
		//
		
		String[] strArray = new String[3]; // 크기가 3개, String은 객체이며 변수가 값을 가지고있지않음
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java"); // 기존에 있든없든 새로운객체를 만듬
		// ex) 기존 Java(101)  new로 생성된 Java(501)   
		// 배열 strArray[Java][Java][Java]  -> strArray[0],strArray[1] = Java(101) strArray[2] = Java(501)
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[1] == strArray[2]); //동등비교 연산자
		System.out.println(strArray[1].equals(strArray[2]));  // equals ->객체에서 들고왔는지 상관하지않는 값비교이기 때문에 true가 나옴
		
		System.out.println();
		
		// for문으로 배열 복사
		int[] oldIntAry = { 1, 2, 3};
		int[] newIntAry = new int[5];
		
		for(int i=0; i<oldIntAry.length; i++) { //배열은 작은쪽의 크기에 맞춰줘야함
			newIntAry[i] = oldIntAry[i];
		}
		for(int i=0; i<newIntAry.length; i++) {
			System.out.println(newIntAry[i]);
		}
		
		//system.arraycopy()
		String[] oldStrAry = {"java", "array", "copy"};
		String[] newStrAry = new String[5];
		
		System.arraycopy(oldStrAry, 0, newStrAry, 2, oldStrAry.length);
		
		for(int i=0; i<newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		}
		
		//향상된 for문
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		//int index = -1;
		for(int score : scores) { // 왼쪽은 임시 배열 , 오른쪽은 가져올 배열
			sum += score;         // 인덱스를 사용하지않고 사용할수있음
			//System.out.println("인덱스 : " + ++index);
			
		}
		System.out.println("점수 총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 : " + avg);
	}
}
