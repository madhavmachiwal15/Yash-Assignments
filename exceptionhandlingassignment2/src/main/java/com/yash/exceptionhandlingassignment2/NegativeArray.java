package com.yash.exceptionhandlingassignment2;

import java.util.*;

public class NegativeArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int sz;
		int[] arr;
		System.out.println("Enter array size:");
		sz = sc.nextInt();

		try
		{
			arr = new int[sz];
		}
		catch (NegativeArraySizeException e)
		{
			System.out.println("Negative size of array");
			System.out.println("Array wasn't created" +e);
			return;
		}

		catch (NumberFormatException e)
		{
			System.out.println("Error numeric format");
			System.out.println("Array wasn't created" +e);
			return;
		}

		System.out.println("Array created succesuful.\n Enter values in the array");

		for (int i = 0; i < sz; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter indexing you want");
		sz = sc.nextInt();

		try
		{
			System.out.println(arr[sz - 1]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error in index" +e);
		}
	}
}
