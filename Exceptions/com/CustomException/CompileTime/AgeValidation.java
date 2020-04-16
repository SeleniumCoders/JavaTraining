package com.CustomException.CompileTime;

public class AgeValidation {

	public void checkAge(int age) throws MyException
	{
		if(age<20)
		{
			throw new MyException("age is less then 20");
		}
		System.out.println("Eligible as per rule");
	}
}
