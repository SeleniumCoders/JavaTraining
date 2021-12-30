package com.collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DisplayHashMap {
	
	public static void main(String[] args) {
		HashMap<String, String> names = new HashMap<>();
		names.put("1", "Mark");
		names.put("2", "Jhon");
		names.put("3", "Mike");
		
		for(String key :names.keySet())
		{
			System.out.println(names.get(key));
		}
		
		Iterator<String> it = names.values().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
