package com.string;

public class StringReverse {

	public static void main(String[] args) {
		String s1 = "Welcome to india";
		char c[] = s1.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
		
		System.out.println();
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		
		
	}
}
