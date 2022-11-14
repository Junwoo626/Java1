package com.yedam.chapter11;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		System.out.println(obj.toString()); // 주소값나옴
		
		Date obj2 = new Date();
		
		System.out.println(obj2.toString());
		
	}
	
}
