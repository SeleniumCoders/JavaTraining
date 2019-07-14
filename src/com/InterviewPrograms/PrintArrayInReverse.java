package com.InterviewPrograms;

public class PrintArrayInReverse {

	public static void main(String[] args) {
		
		int numbers[] = {3,1,5,9,7};
		for(int i=numbers.length-1;i>=0;i--)
		{
			System.out.println(numbers[i]);
		}
	}
}
