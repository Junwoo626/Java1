package com.yedam.java.example;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//
		while() {
			
		}
		System.out.println("학생의 수 >");
		int count = Integer.parseInt(sc.nextLine());
		Student[] Stu = new Student[count]; //Student -> 클래스 이름을 변수로 지정
		//Bank = Stud , Bary = Stu , bank = stud
		for(int i = 0; i< Stu.length; i++) {
			Student stud = new Student();
			
			System.out.println("이름 >");
			String sName = sc.nextLine();
			stud.setsName(sName);
			
			System.out.println("학번 >");
			String sNo = sc.nextLine();
			stud.setsNo(sNo);

			System.out.println("국어 점수 >");
			int kor = Integer.parseInt(sc.nextLine());
			stud.setKor(kor);
			
			System.out.println("수학 점수 >");
			int math = Integer.parseInt(sc.nextLine());
			stud.setMath(math);
			
			System.out.println("영어 점수 >");
			int eng = Integer.parseInt(sc.nextLine());
			stud.setEng(eng);
			Stu[i] = stud;
		}
			
			for(int i = 0; i<Stu.length; i++) {
				Stu[i].getInfo();
			}
			
//			
//			Scanner sc = new Scanner(System.in);
//			
//			Student[] std = null;
//			
//			System.out.println("입력할 학생 수 >");
//			int sCount = Integer.parseInt(sc.nextLine());
//			std = new Student[sCount];
//			
//			for(int i = 0; i<std.length; i++) {
//				Student student = new Student();
//				
//				System.out.println("학생 이름 >");
//				String sName = sc.nextLine();
//				student.setsName(sName);
//				
//				System.out.println("학번 >");
//				String sNo = sc.nextLine();
//				student.setsNo(sNo);
//				
//			}
//			
//			
//			for(int i = 0; i<std.length; i++ ) {
//				System.out.println("학생 이름 > " + std[i].getsName());
//				System.out.println("학생 번호 > " + std[i].getsNO);
//			}
		}
	
}
