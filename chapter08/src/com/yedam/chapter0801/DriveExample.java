package com.yedam.chapter0801;

public class DriveExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
//		driver.drive(bus); //Driver클래스에 vehicle로 들어감 vehicle.run()으로 실행 
//		driver.drive(taxi);	//Driver클래스에 vehicle로 들어감 vehicle.run()으로 실행 
		
		Vehicle vhc = new Bus();
		
		vhc.run();
//		vhc.checkFare(); -> 오류
		
		//강제타입변환 
		Bus bus2 = (Bus) vhc;
		
		bus2.run();
		bus2.checkFare();
		
		//객체 타입 확인
		//instanceof
		
		driver.drive(bus);
		driver.drive(taxi); 
		

	}

}
