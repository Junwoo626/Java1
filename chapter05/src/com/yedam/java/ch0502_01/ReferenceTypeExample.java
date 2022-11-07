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
		
		int sum = 0;
		for(int i=0; i<3; i++) { //인덱스 크기는 1만큼 차이가 나기때문에 <= 사용하지않고 <만 사용
			sum += scores[i];
		}
		sum += scores[0];
		sum += scores[1];
		sum += scores[2];
		
		System.out.println("총합 : " + sum);
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);
		
		// 주의사항 (두개의 차이 변수를 선언할때 값을 주는건 가능하지만 변수를 선언하고나서 후에 값을 주는건 불가능)
		// 만약 변수를 선언한 후에 값을 주고싶으면 new를 붙여서 준다. ex) scoreList = new int[] {83, 90, 87}
		// 하지만 크기는 주면안됨 -> new int[5]  (5 => X)
		int[] scoreList;
		scoreList = {83, 90, 87};
		
		
	}
}
