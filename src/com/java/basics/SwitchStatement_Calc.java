package com.java.basics;

public class SwitchStatement_Calc {
	public static void main(String[] args) {
		int userinput = 2;
		int num1=10;
		int num2 =30;
		double result = 0;
		
		switch (userinput) {
		case 1: System.out.println("Add 2 numbers"); 
			result = num1 +num2;
			break;
		case 2:System.out.println("diff 2 numbers"); 
			result = num1 -num2;
			break;
		case 3: System.out.println("Mul 2 numbers"); 
			result = num1 *num2;
			break;
		case 4: System.out.println("div 2 numbers"); 
			result = num1 /num2;
			break;
		default:System.out.println("Invalid User input");
			break;
		}
		
		System.out.println("Result  = " + result);
	}

}
