package com.yash.arrayassignment2;
import java.util.Scanner;

public class LongestConsecutive {
	public static void main(String args[])
	{
		int [] arr= {49, 1, 3, 200, 2, 4, 70, 5};
		int i = 0;
		int maxCount = 1;
		int tempMax=1;
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]-arr[j-1]==1)
			{
				tempMax++;
			}
			else
			{
				maxCount=Math.max(maxCount, tempMax);
				tempMax=1;
			}
		}
		maxCount=Math.max(maxCount, tempMax);
		System.out.println(maxCount);

	}

}