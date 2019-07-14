package com.class_and_objects;

public class MainCalc {
	
	public static void main(String[] args) {
		int userInput = 3;
		int i=20;
		int j=10;
		Calculator c = new Calculator();
		switch (userInput) {
		case 1:
			c.add(i, j);
			break;
		case 2:
			c.sub(i, j);
			break;
		case 3:
			c.mul(i, j);
			break;
		case 4:
			c.div(i, j);
			break;
	
		default:
			break;
		}
	}

}
