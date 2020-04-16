package com.abstractinction.usingClass;

abstract public class Parent {
	
	public Parent()
	{
		System.out.println("Parent Constructor");
	}
	
	public void display()
	{
		System.out.println("Parent Display");
	}
	
	
	/*public void display(String p)
	{
		System.out.println("Parent Display  - p");
	}*/
	
	
	abstract public void start();

}
