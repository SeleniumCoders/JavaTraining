package com.singleton;

public class SingleTonClass {
	public int i;
	
	//Create Class Object
	private static SingleTonClass singleTon = new SingleTonClass();
	
	//Restrict Object Creation
	private SingleTonClass() {}
	
	//Function to get Object
	public static SingleTonClass getInstance()
	{
		return singleTon;
	}
	

}
