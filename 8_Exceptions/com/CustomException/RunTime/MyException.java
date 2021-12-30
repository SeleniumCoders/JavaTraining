package com.CustomException.RunTime;

public class MyException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public MyException(String error)
	{
		super(error);
	}
}
