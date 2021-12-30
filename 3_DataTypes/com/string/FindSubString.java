package com.string;

public class FindSubString {
	public static void main(String[] args) {
		
		String s1 =  new String("Welcome to India");
		String s2 =  new String("india");
		
		if(s1.contains(s2))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		s1= s1.toLowerCase();
		s2= s2.toLowerCase();
		
		if(s1.contains(s2))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		
		System.out.println(s1.substring(3,6));
		
		
	}

}
