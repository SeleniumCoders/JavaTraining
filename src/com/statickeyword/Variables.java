package com.statickeyword;

public class Variables 
{	
	private int id;
	private String name;
	static String collegeName="IIT";
	 
	 public Variables(int id, String name)
	 {
		 this.id=id;
		 this.name=name;
	 }
	 
	 public void display()
	 {
		 System.out.println("Id = " +id);
		 System.out.println("name = " +name);
		 System.out.println("CollegeName = " +collegeName);
	 }
}
