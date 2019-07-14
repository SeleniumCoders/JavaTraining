package com.statickeyword;

public class Block {
	
	 static{
		 System.out.println("static block is invoked");
	 }
	 
	 {
		 System.out.println("Instance block is invoked");
	 }
	 
	 public static void main(String[] args) {
	    System.out.println("Main Method");  
	  }  

}
