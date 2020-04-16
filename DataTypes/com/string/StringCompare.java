package com.string;

import java.io.Console;

public class StringCompare {
	public static void main(String[] args) {
		
		String s1="India";
		//String s2="India";
		String s2=new String("India");
		String s3=new String("india");
		String s4=new String("");
		String s5=null;
		
		//System.out.println("length of s5 = " +s5.length());
		
		System.out.println("length of s1 = " +s1.length());
		System.out.println("length of s4 = " +s4.length());
		System.out.println("Is string empty = " + s4.isEmpty());
		
		if(s1==s2)   //s1 and s2 refers to memory location
			System.out.println("equal");
		else
			System.out.println("Not equal");
		
		
		if(s1.equals(s2))   //s1 and s2 refers to value
			System.out.println("equal");
		else
			System.out.println("Not equal");
		
		
		if(s1.equalsIgnoreCase(s3))
			System.out.println("equal");
		else
			System.out.println("Not equal");
	}

}
