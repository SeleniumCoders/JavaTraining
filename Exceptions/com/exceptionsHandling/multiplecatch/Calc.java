package com.exceptionsHandling.multiplecatch;

public class Calc {
	
	
	public void div(int i,int j)
	{
		try{
			System.out.println("Result = " + (i/j));
		}catch(ArithmeticException ex)
		{
			System.out.println("div by 0 not allowed");
		}catch(Exception ex)//Generic exception handling should be always last block in multiple catch blocks 
		{
			System.out.println("div by 0 not allowed");
		}finally{
			System.out.println("Operation completed");
		}
				
		
	}

}
