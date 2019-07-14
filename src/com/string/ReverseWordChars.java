package com.string;

public class ReverseWordChars {

	public static void main(String[] args) {
		String s1 = "Welcome to india";
		String words[] = s1.split(" ");
		for (int i=0;i<words.length;i++)
		{
			for(int j=words[i].length()-1;j>=0;j--)
			{
				System.out.print(words[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
}
