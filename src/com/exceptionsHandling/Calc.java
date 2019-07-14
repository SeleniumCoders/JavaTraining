package com.exceptionsHandling;

public class Calc {
	
	
	public void div(int i,int j)
	{
		try{
			System.out.println("Result = " + (i/j));
		}catch(ArithmeticException ex)
		{
			System.out.println("div by 0 not allowed");
		}
				
		
	}

}
