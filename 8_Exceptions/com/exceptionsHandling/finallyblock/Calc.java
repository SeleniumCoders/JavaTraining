package com.exceptionsHandling.finallyblock;

public class Calc {
	
	
	public void div(int i,int j)
	{
		try{
			System.out.println("Result = " + (i/j));
		}catch(ArithmeticException ex)
		{
			System.out.println("div by 0 not allowed");
		}finally{  //Executes always irrespective of exception
			//USed for important coding like file close, DB close
			System.out.println("Operation completed");
		}
				
		
	}

}
