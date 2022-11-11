package com.yedam.java.hw221111_p02;

public class StandardWeightInfo extends Human{
	double StandardWeight;
	public StandardWeightInfo(String name, int height, int weight) {
		super(name,height,weight);
	}
	public void getInformation() { //getInfo
		super.getInformation();
		System.out.println("표준체중 : " + );
	}
	public double getStandardWeight() {
		System.out.println((height- 100)*0.9);
	}
}
