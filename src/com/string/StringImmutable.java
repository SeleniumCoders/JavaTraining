package com.string;

public class StringImmutable {
	public static void main(String[] args) {
		
		String name="Kiran";
		name.concat(" Is Trainer");  //This will create new memory without any reference
		//name=name.concat(" Is Trainer"); 
		System.out.println(name);
	}

}
