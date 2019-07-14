package com.CustomException.RunTime;

public class AgeValidation {

	public void checkAge(int age)
	{
		if(age<20)
		{
			throw new MyException("age is less then 20");
		}
		System.out.println("Eligible as per rule");
	}
}
