package com.ThisAndSuper;

public class ParentClass {

	String className="ParentClass";
	
	public ParentClass(){
		System.out.println("Parent Constructor");
	}
	
	public ParentClass(String p){
		System.out.println("Parent Constructor with Parameter");
	}
	
	
	
	public void display(String className)
	{
		System.out.println("Inside Parent Display - " + className);
	}
}
