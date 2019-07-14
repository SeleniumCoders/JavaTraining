package com.constructorUsage.calcProgram;

public class MainClass {
	
	public static void main(String[] args) {
		int i=10;
		int j=2;
		Calc c =new Calc(i,j);
		Calc c1 =new Calc(5,2);
		c.display();
		c.add();
		c1.display();
		c1.add();
	}

}
