package com.yedam.java.ch0502_01;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		
		// 배열을 선언하는 방식 -> 모든 타입을 값으로 가질 수 있음
		int[] intAry = null;
		//System.out.println("intAry[0] : " + intAry[0]); //해당 배열에 접근하는 방식 변수 + [인덱스값]
	
		// 값을 초기화하면서 배열을 생성
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		//배열은 크기가 일정하고 for문과 많이쓰인다.
		
		int sum = 0;
		for(int i=0; i<3; i++) { //인덱스 크기는 1만큼 차이가 나기때문에 <= 사용하지않고 <만 사용
			sum += scores[i];
		}
		sum += scores[0];
		sum += scores[1];
		sum += scores[2];
		
		System.out.println("총합 : " + sum);
		double avg = (double)sum / scores.length;
		System.out.println("평균 : " + avg);
		
		// 주의사항 (두개의 차이 변수를 선언할때 값을 주는건 가능하지만 변수를 선언하고나서 후에 값을 주는건 불가능)
		// 만약 변수를 선언한 후에 값을 주고싶으면 new를 붙여서 준다. ex) scoreList = new int[] {83, 90, 87}
		// 하지만 크기는 주면안됨 -> new int[5]  (5 => X)
		int[] scoreList;
		
		scoreList = new int[] {83, 90, 87};
		
		sum = 0;
		for(int i=0; i<3; i++) {
			sum = sum + scoreList[i];
		}
		System.out.println("총합 : " + sum);
		
		sum = add(new int[]{83, 90, 87});
		
		// new 연산자로 배열 생성
		int[] array = new int[3];
		//인트가 크기가 3인 배열로 만들어짐
		for(int i=0; i<3; i++) {
			System.out.println("array["+ i +"] : " + array[i]);
		}
		
		String[] strAry = new String[4];
		for(int i=0; i<strAry.length; i++ ) { // => 모든배열은 length가 존재
			strAry[i] = String.valueOf(i); // 주석처리하면 null값으로 나옴
		}
		
		for(int i=0; i<strAry.length; i++ ) { // => 모든배열은 length가 존재
			System.out.println("strAry[" + i + "] : " + strAry[i]);
		}
		
		
		//		int add(int[] numList) {
//			int sum = 0;
//			for(int i=0; i<numList.length;; i++) {
//				sum += numList[i];
//			}
//			ruturn sum;
//		}
//		
		
	}

	private static int add(int[] is) {
		// TODO Auto-generated method stub
		return 0;
	}
}
