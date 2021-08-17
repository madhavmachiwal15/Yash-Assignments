package com.java.array;

public class Odd_Even_Positive_Negative_Number 
{

	public static void main(String[] args) 
	{
		int i, n=0, p=0, e=0, o=0;
		int arr[] = {11, 17, 23, -34, -67, 66, 78, 89, -87, 6, 7, -1, -4, 8, 2};
	
		for(i=0; i<arr.length; i++)
		{
			if(arr[i]>0)
				p++;
			else 
				n++;
			
			if(arr[i]%2==0)
				e++;
			else
				o++;
		}
		System.out.println("Total number of Positive numbers: "+p);
		System.out.println("Total number of Negative numbers: "+n);
		System.out.println("Total number of Odd numbers: "+o);
		System.out.println("Total number of Even numbers: "+e);

	}

}
