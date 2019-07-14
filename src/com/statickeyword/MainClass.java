package com.statickeyword;

public class MainClass {
	
	public static void main(String[] args) {
		Variables v1= new Variables(100, "Kiran");
		Variables v2= new Variables(101, "Kumar");
		Variables v3= new Variables(102, "Shlok");
		v1.display();
		v2.display();
		v2.display();
		
		Functions f1 = new Functions();
		Functions f2 = new Functions();
		Functions f3 = new Functions();
		f1.registarStudent(100, "Amit", "IIT");
		f2.registarStudent(100, "Sanvi", "JSS");
		f3.registarStudent(100, "Ashwini", "MSRIT");
		
		f1.display();
		f2.display();
		f3.display();
	}

}
