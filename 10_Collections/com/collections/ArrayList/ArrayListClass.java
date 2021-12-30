package com.collections.ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
public static void main(String[] args) {
	
	ArrayList<String> names =  new ArrayList<String>();
	System.out.println("size of array = " + names.size());
	names.add("kiran");
	names.add("kumar");
	names.add("mark");
	
	System.out.println("size of array after adding 3 names= " + names.size());
	System.out.println(names);
	System.out.println("get 2nd element = " + names.get(1));
	names.add(1, "jhon");
	System.out.println(names);
	names.remove(0);
	System.out.println("remove 0 " + names);
	names.remove("mark");
	System.out.println("remove mark " + names);
	
	
	ArrayList<String> tempName = new ArrayList();
	tempName.add("xyz");
	tempName.add("abc");
	names.addAll(tempName);
	System.out.println("After add all " + names);
	
	
	names.clear();
	System.out.println("size of array after clear = " + names.size());
	
}
}
