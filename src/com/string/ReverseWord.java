package com.string;

public class ReverseWord {
	
	public static void main(String[] args) {
		String s1 = "Welcome to India";
		String words[] = s1.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i] + " ");
		}
	}

}
