package com.statickeyword;

public class Functions {
	private int id;
	private String name;
	static String collegeName="IIT";
	
	public void registarStudent(int id, String name,String collegeName)
	{
		 this.id=id;
		 this.name=name;
		 this.collegeName=collegeName;
	}
	
	/*public static void registarStudent(int idTemp, String nameTemp,String clgName)
	{
		 id=idTemp;
		 this.name=nameTemp;
		 collegeName=clgName;
	}*/

	public void display()
	 {
		 System.out.println("Id = " +id);
		 System.out.println("name = " +name);
		 System.out.println("CollegeName = " +collegeName);
	 }
}
