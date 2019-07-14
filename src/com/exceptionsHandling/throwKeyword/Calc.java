package com.exceptionsHandling.throwKeyword;

public class Calc {
	
	
	public void div(int i,int j)
	{
		try{
			System.out.println("Result = " + (i/j));
		}catch(ArithmeticException ex)
		{
			System.out.println("div by 0 not allowed");
			throw ex;
		}finally{
			System.out.println("Operation completed");
		}
				
		
	}

}
