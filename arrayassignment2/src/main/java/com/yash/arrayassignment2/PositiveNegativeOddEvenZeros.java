package com.yash.arrayassignment2;
/**
 * Creating class to find number of positive, negative, odd, even and zero number
 * @author Madhav Machiwal
 *
 */
public class PositiveNegativeOddEvenZeros 
{
	public static void main(String[] args) 
	{
		int i, n=0, p=0, e=0, o=0, z=0;
		int arr[] = {11, 17, 23, -34, -67, 66, 78, 0, -87, 6, 7, -1, -4, 8, 2, 0, 0,0};
	
		for(i=0; i<arr.length; i++)
		{
			if(arr[i]>0)
				p++;
			else if(arr[i]==0)
				z++;
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
		System.out.println("Total number of Zeros: "+z);

	}

}
