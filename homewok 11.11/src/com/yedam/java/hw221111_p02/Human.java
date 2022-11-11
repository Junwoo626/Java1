package com.yedam.java.hw221111_p02;

public class Human {

	public String name;
	public int height;
	public int weight;
	
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public void getInformation() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
	}
	
	
	
}
