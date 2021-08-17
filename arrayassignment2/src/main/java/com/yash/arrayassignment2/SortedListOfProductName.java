package com.yash.arrayassignment2;
/**
 * Creating a class to produce list of sorted elements
 * @author Madhav Machiwal
 *
 */
public class SortedListOfProductName 
{
	public static void main(String[] args)
	{
		String products[] = {"Apple", "Soap", "AC", "Bike", "Mango", "Van"};
		String temp;
		
		for(int i=0; i<products.length; i++)
	    {
			for(int j=i+1; j<products.length; j++)
	        {
				if(products[i].compareTo(products[j])>0)
				{
					temp = products[i];
					products[i]=products[j];
					products[j]=temp;
				}
	        }
	    }
		
		System.out.println("Products in Sorted Manner: ");
		for(int i=0; i<products.length; i++)
		{
			System.out.println(products[i]);
		}
	}

}
