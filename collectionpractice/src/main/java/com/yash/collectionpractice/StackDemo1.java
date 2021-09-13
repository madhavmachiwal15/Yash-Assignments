package com.yash.collectionpractice;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		Stack<Integer> obj = new Stack<>();

		boolean result = obj.empty();
		System.out.println("Is stack empty: "+result);
		
		obj.push(11);
		obj.push(12);
		obj.push(66);
		obj.push(99);
		
		System.out.println(obj);
		
		boolean res = obj.empty();
		System.out.println("Is stack empty: "+res);
	}

}
