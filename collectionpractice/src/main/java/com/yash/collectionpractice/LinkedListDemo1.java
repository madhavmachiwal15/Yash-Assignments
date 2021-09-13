package com.yash.collectionpractice;

import java.util.*;

public class LinkedListDemo1 
{
	public static void main(String[] args)
	{
		LinkedList<String> obj = new LinkedList<>();
		obj.add("Madhav");
		obj.add("Atul");
		obj.add("Madhav");
		obj.add("Arjun");

		Iterator<String> itr = obj.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Murtaza");
		list.add("Aman");
		list.add("Mayank");
		list.set(2, "Shivam");
		obj.addAll(list);

		System.out.println(list);
	}

}
