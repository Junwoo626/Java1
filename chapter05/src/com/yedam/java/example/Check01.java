package com.yedam.java.example;

public class Check01 {
	public static void main(String[] args) {
		// 문제1 ) 주어진 배열의 총합과 평균을 구하세요.
		int[] array = { 10, 53, 26, 85, 75 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("총합 : " + sum);
		double avg = sum / (double) array.length; // length는 크기기 때문에 정수
		// 평균은 for문안에 x 실질적으로 총합이 나오는 for문뒤에서 평균을 구해야함
		System.out.printf("평균 : %.2f\n", avg);

		// 문제2 ) 배열의 최대값과 최소값을 구하세요.

		int[] mami = { 10, 53, 26, 85, 75 };
		int max = mami[mami.length - 1];
		int min = mami[0];

		for (int i = 0; i < mami.length; i++) {
			// 최대값
			if (max < mami[i]) {
				max = mami[i];
			}

			// 최소값
			if (min > mami[i]) {
				min = mami[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		// 문제3 ) 문제2에서 구한 최대값과 최소값이 각각 인덱스가 뭔지 구하세요.

//		int[] mami = { 10, 53, 26, 85, 75 };
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i < mami.length; i++) {
			// 최대값 인덱스
			if (max == mami[i]) {
				maxIndex = i;
			}

			// 최소값 인덱스
			if (min == mami[i]) {
				minIndex = i;
			}
		}
		System.out.println("최대값 : " + max + "는 " + (maxIndex + 1) + "번째입니다.");
		System.out.println("최소값 : " + min + "는 " + (minIndex + 1) + "번째입니다.");

	}
}
