package com.CustomException.CompileTime;

public class MainClass {

	public static void main(String[] args) {
		AgeValidation a = new AgeValidation();
		//a.checkAge(30);
		try {
			a.checkAge(10);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
