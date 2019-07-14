package com.InterviewPrograms;

public class ReverseanArray {
	
	public static void main(String[] args) {
		int a[] = {2,8,3,5,7};
		int mid = a.length/2;
		int j=a.length-1;
		for(int i=0;i<=mid;i++)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
			j--;
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
