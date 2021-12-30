package com.inheritance.multilevel;

public class MainClass {

	public static void main(String[] args) {
		
		Child  c1 =  new Child();
		Parent p = new Parent();
		c1.childDisplay();
		c1.parentDisplay();
		c1.grandParentDisplay();
		
		p.parentDisplay();
		p.grandParentDisplay();
		
	}
}
