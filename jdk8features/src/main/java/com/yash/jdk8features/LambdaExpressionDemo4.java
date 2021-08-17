package com.yash.jdk8features;

import java.util.ArrayList;

public class LambdaExpressionDemo4 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(5);
		ar.add(1);
		ar.add(4);
		ar.add(6);
		ar.add(7);
		
		ar.forEach((n) -> { System.out.println(n); });
	}

}
