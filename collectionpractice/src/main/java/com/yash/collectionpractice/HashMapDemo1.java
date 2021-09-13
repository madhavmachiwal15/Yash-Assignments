package com.yash.collectionpractice;
import java.util.HashMap;
import java.util.Map.Entry;
public class HashMapDemo1
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> obj = new HashMap<>();
		obj.put(1, "Madhav");
		obj.put(2, "Atul");
		obj.put(3, "Arjun");
		obj.put(4, "Aman");
		
		//System.out.println(obj.get(1));
		
		for(Entry<Integer, String> d:obj.entrySet())
		{
			System.out.println(d.getKey()+"\t"+d.getValue());
		}
		
	}
}
