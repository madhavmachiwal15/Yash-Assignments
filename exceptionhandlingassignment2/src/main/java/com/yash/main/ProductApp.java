package com.yash.main;

import com.yash.pojo.Product;

public class ProductApp 
{

	public static void main(String[] args) 
	{
		Product obj[] = new Product[5];
		
		
		obj[0] = new Product(1, "Bottle", 150, "Blue");
		obj[1] = new Product(2, "Laptop", 50000, "Black");
		obj[2] = new Product(3, "T Shirt", 450, "Gray");
		obj[3] = new Product(4, "Mobile", 15000, "Golden");
		obj[4] = new Product(5, "Cooler", 5790, "White");
	
		obj[0].display();
		obj[1].display();
		obj[2].display();
		obj[3].display();
		obj[4].display();
	}

}
