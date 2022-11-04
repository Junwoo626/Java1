package com.yedam.com.ch0205;

public class VariableExample {
	public static void main(String[] args) {
		//문제1)
		int x;
		int y;
		x = 91;
		y = 37;
		
		
		//문제2)
		int result1 = x + y;
		int result2 = x - y;
		int result3 = x * y;
		int result4 = x / y;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		//문제3)
		
		  /*byte var1 = 128; =>*/ int var1 = 128;
		  /*char var2 = "B"; =>*/ char var2 = 'B';
		  /*String var3 = 44032; =>*/ String var3 = "44032";
		  /*int var4 = 100000000000; =>*/ long var4 = 100000000000;
		  /*float var5 = 43.93106; =>*/ float var5 = 43.93106F;
		  /*long var6 = 301.3; =>*/ double var6 = 301.3;
		 
		
		System.out.printf("%d",var1);
		System.out.printf("%s",var2);
		System.out.printf("")
		System.out.printf("%012d",var4);
		System.out.printf("%8.5f",var5);
		System.out.printf("")
		
		 //문제4
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;
		double e = 45.31;

		long result5 = a + c + d;
		System.out.println(result5);
		
		int result6 = a + b + c;
		System.out.println(result6);

        double result7 = c + d + e;
        System.out.println(result7);
  	
		//문제 5
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
		
		System.out.println("charValue" + (intValue1 + intValue2) + "intvalue3" + "strValue" + "(double)intValue4");
		
		// git관련 작업 
	}
}
		 
		 
		 
		 
		 
		
		
