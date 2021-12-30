package com.exceptionsHandling.tryWithoutCatch;

public class Calc {
	
	
	public void div(int i,int j)
	{
		try{
			System.out.println("Result = " + (i/j));
		}finally{  
			System.out.println("Operation completed");
		}
				
		
	}

}
