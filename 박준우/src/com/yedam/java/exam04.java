package com.yedam.java;

public class exam04 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j=1; j <=9; j++) {
				if(j>i) {
					break;
				}
				System.out.println(i + "X" + j + "=" + i*j);
			}
		}
	}
}
