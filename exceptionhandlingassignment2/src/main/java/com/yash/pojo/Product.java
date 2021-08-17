package com.yash.pojo;

public class Product 
{
	long id;
	String name;
	double price;
	String color;
	
	public Product(long id, String name, double price, String color)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;
		
	}
	
	public void display()
	{
		
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + "]";
	}
}
