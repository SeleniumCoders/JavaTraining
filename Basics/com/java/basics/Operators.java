package com.java.basics;

public class Operators {

		public static void main(String[] args) {
			int var1 = 10;
			int var2 = 30;
			int sum, diff;
			
			sum = var1 + var2;
			diff = var2 - var1;
			
			System.out.println("Arithmetic Operator");
			System.out.println("Sum of 2 numbers = " + sum);
			System.out.println("Differance of 2 numbers  = " + diff);
			
			System.out.println("Relational Operator");
			if(var1>var2)
				System.out.println("var1 is larger number");
			else
				System.out.println("var2 is larger number");
			
			System.out.println("Conditional Operator");
			String large = var1>var2?"var1":"var2";
			System.out.println(large + " larger number");
			
			
			
			
			
			
		}
}
