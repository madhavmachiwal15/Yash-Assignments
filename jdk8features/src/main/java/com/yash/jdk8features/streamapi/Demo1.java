package com.yash.jdk8features.streamapi;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;  

public class Demo1 
{
	public static void main(String[] args) 
	{
		ArrayList<Product> pr = new ArrayList<>();
		pr.add(new Product(101, "TV", 20000));
		pr.add(new Product(102, "Mobile", 20000));
		pr.add(new Product(201, "Laptop", 40000));
		pr.add(new Product(304, "IPhone", 200000));
		pr.add(new Product(100, "Adaptor", 2000));

		ArrayList<Double> pr2 =(ArrayList<Double>) pr.stream()  
				.filter(p -> p.price > 30000)// filtering data  
				.map(p->p.price)        // fetching price  
				.collect(Collectors.toList()); // collecting as list  
		System.out.println(pr2); 
		
		ArrayList<String> pr3 =(ArrayList<String>) pr.stream()  
				.filter(p -> p.name == "TV")// filtering data  
				.map(p->p.name)        // fetching price  
				.collect(Collectors.toList()); // collecting as list  
		System.out.println(pr3); 

		// for maximum price
		Product p1 = pr.stream()
				.max((product1, product2)-> product1.price > product2.price ? 1: -1).get();
		System.out.println(p1.price);

		// for minimum price
		Product p2 = pr.stream()
				.min((product1, product2) -> product1.price > product2.price ? 1: -1).get();
		System.out.println(p2.price);

		// product list greater than particular price 
		pr.stream().filter(product -> product.price >= 20000)
		.forEach(product -> System.out.println(product.name));

		// sum of price using Collectors method
		double totalPrice3 = pr.stream()  
				.collect(Collectors.summingDouble(product->product.price));  
		System.out.println(totalPrice3); 

		//count method
		long count = pr.stream()
				.filter(product -> product.price >= 30000)
				.count();
		System.out.println("Count: "+count);


		// Converting product List into Set  
		Set<Double> productPriceList =   
				pr.stream()  
				//    .filter(product->product.price > 0)    
				.map(product->product.price)  
				.collect(Collectors.toSet());     // to remove duplications
		System.out.println(productPriceList); 

	}

}
