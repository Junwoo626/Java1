package com.yedam.chapter11;

public class Problem {
	public static void main(String[] args) {
		
		//문제1
		String str = "abcdefg";
		
		for(int i = str.length()-1; i >=0; i-- ) {
			System.out.print(str.charAt(i)); //뒤에서부터 하나씩 가져옴
		}
		
		//문제2
		String str1 ="1a2v4b";
		//숫자 48~57 , 영어대문자 65~90 , 영어소문자 97~122
		byte cntNo=0;
		byte cntEn=0;
		for(int i = 0; i<(byte)str1.length()-1; i++) {
			if(str1.charAt(i)>=48 && str1.charAt(i)<=57) {
				cntNo += 1;
			}
		}
		
		
		
		
		
		
		
		
	}
}
