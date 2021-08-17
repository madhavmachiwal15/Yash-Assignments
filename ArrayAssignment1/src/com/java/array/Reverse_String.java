package com.java.array;

public class Reverse_String 
{
	public static String reverse (String input)
	{
		char [] result = input.toCharArray();
		
		int start=0;
		int end=result.length-1;
		char temp;
		
		for(; end>start; start++, end--)
		{
			temp = result[start];
			result[start] = result[end];
			result[end] = temp;
		}
		return new String(result);
		
	}

	public static void main(String[] args) 
	{
		String str = "Yash Technologies";
		System.out.println(reverse(str));
	}

}
