package com.yedam.chapter0801;

public class Car {
	
	Tire frontLeftTire = new NexenTire();
	Tire frontRightTire = new NexenTire();
	Tire backLeftTire = new NexenTire();
	Tire backRightTire = new NexenTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
}
