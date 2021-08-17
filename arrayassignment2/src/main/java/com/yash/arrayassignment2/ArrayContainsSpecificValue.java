package com.yash.arrayassignment2;
/**
 * Creating a class to find specific value in array
 * @author Madhav Machiwal
 *
 */
public class ArrayContainsSpecificValue 
{

	public static void main(String[] args) 
	{
		int n, x, i;
		boolean flag=false;
		int arr[] =new int[] {10,20,30,10,50};
		
		x=50; //Elements needs to be found
		
		for(i=0; i<arr.length; i++)
		{
			if(arr[i]==x)
			{
				flag=true;
				break;
			}
			else
			{
				flag=false;
			}
		}
		
		if(flag==true)
			System.out.println("Element found at Position: "+(i+1));
		else
			System.out.println("Element not found!!");
		

	}

}
