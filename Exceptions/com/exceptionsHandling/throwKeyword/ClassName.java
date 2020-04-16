package com.exceptionsHandling.throwKeyword;


public class ClassName {
	
	public static void main(String[] args) {
		Calc c =  new Calc();
		try{
		c.div(10, 0);
		}catch(Exception ex)
		{
			System.out.println("Main Catch");
		}
	}

}
