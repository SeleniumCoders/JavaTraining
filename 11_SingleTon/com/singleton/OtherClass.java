package com.singleton;

public class OtherClass {
	
	public void displaySingleVariable()
	{
		SingleTonClass s = SingleTonClass.getInstance();
		System.out.println("From Main Other Class " + s.i);
	}

}
