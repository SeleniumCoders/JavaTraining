package com.collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDisplay {

	public static void main(String[] args) {
		ArrayList<String> names =  new ArrayList<String>();
		names.add("kiran");
		names.add("kumar");
		names.add("mark");
		names.add("");
		names.add("mark");
		
		/*for(String name:names)
		{
			System.out.println(name);
		}*/		
		
		Iterator<String> it = names.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
