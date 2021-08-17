package com.java.array;

public class Search_Number {

	public static void main(String[] args)
	{
		int x, count=0;
		int arr[] = {2,3,3,4,5,9};
		System.out.println("Array elemnts are: ");
		for(int i=0; i<5; i++)
		{
			System.out.println(arr[i]);
		}
		x=3;
		System.out.println("Number to be searched: "+x);
		
		for(int i=0; i<5; i++)
		{
			if(arr[i]==x)
			{
				count++;
			}
		}
		
		System.out.println("Frequency of "+x+" is "+count);
	}

}
