package com.java.array;

public class Reverse_Array 
{

	public static void main(String[] args) 
	{
		int [] arr1 = new int[] {10,20,30,40,50};
		int [] arr2 = new int[arr1.length];
		int i,j;
		
		System.out.println("The elements of array are: ");
		for(i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+"\t");
		}
		
		for(i=0, j =arr1.length-1; i<arr1.length; i++,j--)
		{
			arr2[i]=arr1[j];
		}
		
		System.out.println();
		System.out.println("Array after Copying and Reverse order: ");
		for(i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i]+"\t");
		}
	}

}
