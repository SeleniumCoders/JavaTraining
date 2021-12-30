package com.singleton;

public class MainClass {

	public static void main(String[] args) {
		SingleTonClass s = SingleTonClass.getInstance();
		s.i=10;
		System.out.println("From Main Class " + s.i);
		
		OtherClass o = new OtherClass();
		o.displaySingleVariable();
	}

}
