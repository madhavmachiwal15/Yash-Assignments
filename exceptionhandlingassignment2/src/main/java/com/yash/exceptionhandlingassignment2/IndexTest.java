package com.yash.exceptionhandlingassignment2;

import java.util.Scanner;

public class IndexTest 

{
	public static void main(String args[])
	{
		String [] FirstName= {"Madhav", "Dharmesh", "vipin", "Kushgra", "Harsh", "Ayush", "Atul", "Aman", "Aayushi", "Arjun"};
		String integer;
		try 
		{
			System.out.println("Enter the index from 1 to 10 ");	
			Scanner sc=new Scanner(System.in);
			integer=sc.nextLine();
			int i=Integer.parseInt(integer);
			i=i-1;
			System.out.println(FirstName[i]);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
