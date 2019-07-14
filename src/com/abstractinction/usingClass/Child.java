package com.abstractinction.usingClass;

public class Child extends Parent {

	@Override
	public void start() {
		System.out.println("Child start - abstarct");		
	}
	
	
	public void childStart() {
		System.out.println("Childstart()");		
	}

}
