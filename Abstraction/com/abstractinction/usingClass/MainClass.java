package com.abstractinction.usingClass;

public class MainClass {

	public static void main(String[] args) {
		
		Parent c= new Child();
		c.display();
		c.start();
		//c.childStart();
		
		//Cant create object of Abstratc class
		//Parent p = new Parent();
	}
}
