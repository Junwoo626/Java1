package com.yedam.chapter0801;

public class Example {

	public static void main(String[] args) {
		ImplementaionC impl = new ImplementaionC();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
	
}
