package com.method_overriding;

public class MainClass {
	
	public static void main(String[] args) {
		Parent A = new Parent();
		A.display();
		A.displayParent();
		//A.displayChild();  //Will not have Access to child Method
		
		Child B = new Child();
		B.display();  //Priority for child, called Overriding
		B.displayParent();
		B.displayChild();
		
		
		Parent C = new Child();   //Called Type casting
		C.display();
		C.displayParent();
		//C.displayChild();
	}

}
