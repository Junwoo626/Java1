package com.yedam.java.ch0604;

public class Computer {
	
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i<values.length; i++ ) {
			sum += values[i];
		}
	
		return sum;
	}
	
	int sum2(int ... values) { // ... -> 배열로 받아두지만 배열은 아님 values가 배열
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
