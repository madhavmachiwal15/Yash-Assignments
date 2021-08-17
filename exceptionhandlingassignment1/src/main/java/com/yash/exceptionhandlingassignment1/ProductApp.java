package com.yash.exceptionhandlingassignment1;
import java.util.*;
public class ProductApp 
{
	static int productId;
	static String productName;
	static double productPrice;
	
	public static void main(String args[]) throws InvalidInputException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id: ");
		productId=sc.nextInt();
		
		if(productId>100 && productId<200)
			System.out.println(productId);
		
		else
			throw new InvalidInputException("Invalid Input");
		
	/*	System.out.println("Enter Product Name: ");
		productName = sc.next();
		
		
		if(productName!=" ")
			System.out.println(productName);
		else
			throw new InvalidInputException("Invalid Input");  */
		
		System.out.println("Enter Product Price: ");
		productPrice = sc.nextDouble();
		
		if(productPrice>100)
			System.out.println(productPrice);
		
		else
			throw new InvalidInputException("Invalid Input");
	}
	
}
