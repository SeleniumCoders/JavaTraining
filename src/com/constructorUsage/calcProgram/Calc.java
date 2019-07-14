package com.constructorUsage.calcProgram;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class Calc
{
	int i;
	int j;
	public Calc(int num1, int num2){
		System.out.println("Insede Calc");
		i=num1;
		j=num2;
	}
	public void display()
	{
		System.out.println(i +"-----"+j);
	}
	public void add()
	{
		int c= i+j;
		System.out.println("Result =" + c);				
	}
	
	public void diff()
	{
		int c= i-j;
		System.out.println("Result =" + c);				
	}
	
	
	public void mul()
	{
		int c= i*j;
		System.out.println("Result =" + c);				
	}
	
	
	public void div()
	{
		int c= i/j;
		System.out.println("Result =" + c);				
	}
}
