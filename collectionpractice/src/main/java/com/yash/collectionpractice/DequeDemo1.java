package com.yash.collectionpractice;

import java.util.*;

public class DequeDemo1 {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> obj = new ArrayDeque<>();
		obj.offer(10);
		obj.offer(66);
		obj.add(78);
		obj.offerFirst(99);
		
		for(Integer i: obj)
			System.out.println(i);
		
		obj.pollLast();
		
		for(Integer i: obj)
			System.out.println(i);	

	}

}
