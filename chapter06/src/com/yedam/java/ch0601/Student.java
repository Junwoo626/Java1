package com.yedam.java.ch0601;

public class Student {
	
	//필드
	
	private String sName;
	private String sSchool;
	private int sNo;
	private int sYear;
	private int kor;
	private int eng;
	private int math;
	
	// 생성자
	// 생성자를 통해서 모든 데이터를 입력
//	public  Student(String sSchool, String sName, int sNo, int sYear, int kor, int eng, int math) {
//		this.sSchool = sSchool;//  this -> 뒤에 넣어줌
//		this.sName = sName;
//		this.sNo = sNo;
//		this.sYear = sYear;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		
//	}
	

	public String getsName() {
		return sName;
	}

	public String getsSchool() {
		return sSchool;
	}

	public int getsNo() {
		return sNo;
	}

	public int getsYear() {
		return sYear;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	}

	public void setsSchool(String sSchool) {
		this.sSchool = sSchool;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public void setsYear(int sYear) {
		this.sYear = sYear;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}


	// 메소드
	// getInfo()  학생의 내용을 출력할 수 있는 기능
	public void getInfo() {
		System.out.println("내가 다니는 학교 : " + sSchool);
	}

}
