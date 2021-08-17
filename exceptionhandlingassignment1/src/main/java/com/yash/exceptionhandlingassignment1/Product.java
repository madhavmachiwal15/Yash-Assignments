package com.yash.exceptionhandlingassignment1;
/**
 * Exception handling checking for null object creation
 * @author Madhav Machiwal
 *
 */
public class Product 
{
	static String productName; 
	public void ProductName(String productName)
	{
		this.productName=productName;
	}
	
	void display()
	{
		System.out.println(productName);
	}
	
	public static void main(String args[])
	{
		
			Product[] p; 
			p=null;
		//	p = new Product[3];
			try 
			{
			p[0].ProductName("TV");
			p[1].ProductName("Mobile");
			p[2].ProductName("Laptop");
				
			p[0].display();
			p[1].display();
			p[2].display();
			}
			
			catch(NullPointerException e)
			{
				System.out.println(e.getMessage());
			}
		
	}
}
