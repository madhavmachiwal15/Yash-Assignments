package com.yash.arrayassignment2;
/**
 * Creating a Class to get list of products with duplicate values
 * @author Madhav Machiwal
 *
 */
public class ListOfProductsWithDuplicateValue 
{
    public static void main( String[] args )
    {
        String [] products = {"TV", "Radio", "Mobile", "TV", "TV", "Laptop", "Mobile"};
        
        System.out.println("List of Duplicate Products are: ");
        
        for(int i=0; i<products.length; i++)
        {
        	for(int j=i+1; j<products.length; j++)
        	{
        		if(products[i]==products[j])
        			System.out.println(products[j]);
        	}
        }
    }
}
