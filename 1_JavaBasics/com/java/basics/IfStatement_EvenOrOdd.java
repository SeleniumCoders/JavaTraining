package com.java.basics;

public class IfStatement_EvenOrOdd
{
public static void main(String[] args) {
	
	int i=12;
	
	if(i%2==0)
	{
		System.out.println(i + " Given Number is Even");
		if(i%5==0)
		{
			System.out.println(i + " Given Number is div by 5");
		}
	}
	else
	{
		System.out.println(i + " Given Number is Odd");
	}
	
	System.out.println("End Of program");
}
}
