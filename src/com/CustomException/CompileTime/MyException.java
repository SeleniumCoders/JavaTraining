package com.CustomException.CompileTime;

public class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyException(String error)
	{
		super(error);
	}
}
