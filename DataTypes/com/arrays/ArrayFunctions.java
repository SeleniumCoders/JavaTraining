package com.arrays;

public class ArrayFunctions {
	
	public static void main(String[] args) {
		String names[]= {"Kiran","Nithin","Harsh","Santhosh"};
		
		//Accessing Array Element
		System.out.println("First Element =" + names[3]);
		
		//Array Length
		System.out.println("length = " + names.length);
		
		//Print Array
		System.out.println("***Print names with For Loop***");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		//Print Array Using For Each
		System.out.println("***Print names with For Each Loop***");
		for(String name : names)
		{
			System.out.println(name);
		}
		
	}

}
