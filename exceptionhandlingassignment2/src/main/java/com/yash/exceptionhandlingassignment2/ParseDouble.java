package com.yash.exceptionhandlingassignment2;

import java.util.Scanner;  
public class ParseDouble
{
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);  

		try
		{  
			System.out.print("Enter any string:");  
			String str = sc.next();  
			System.out.println("Your entered string is :" +str);

			Double d1 = Double.parseDouble(str);  
			String str1="13.20";
			//String str1=null;
			Double d2 = Double.parseDouble(str1);  

			System.out.println("1. Double value = " + d1);  
			System.out.println("2. Double value = " + d2);  
		}

		catch (NullPointerException  | NumberFormatException e)
		{  
			System.out.println(e);  
		}
		  
	}	  
}
