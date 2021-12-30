package com.collections.HashMap;

import java.util.HashMap;

public class HashMapBasicOprations {
	public static void main(String[] args) {
		HashMap<String, String> a = new HashMap<>();
		a.put("1", "Mark");
		a.put("2", "Jhon");
		a.put("3", "Mike");
		
		System.out.println(a);
		System.out.println("get 3rd details = " + a.get("2"));
		
		System.out.println(a.keySet());
		System.out.println(a.values());
		a.replace("2", "Kiran");
		System.out.println(a);		
		
		
	}
}
