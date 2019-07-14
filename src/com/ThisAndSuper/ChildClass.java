package com.ThisAndSuper;

public class ChildClass extends ParentClass{
	String className="ChildClass";
	
	public ChildClass(){
		super("new");  //To call parent Constructor
		System.out.println("Child Constructor");
	}
	
	public void display()
	{
		System.out.println("Inside Parent Display - " + className);
	}
	
	public void display(String className)
	{
		super.display(className);  //To call parent class method
		this.display();
		System.out.println("Inside Child Display - " + className);
		System.out.println("Inside Child Display - " + this.className);
		//To refer Parent class variable
		System.out.println("Inside Child Display - " + super.className);
		
	}
}
