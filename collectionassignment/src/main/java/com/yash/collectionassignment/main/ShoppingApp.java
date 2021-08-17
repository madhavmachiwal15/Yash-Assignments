package com.yash.collectionassignment.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import com.yash.collectionassignment.helper.ProductIdComparator;
import com.yash.collectionassignment.helper.ProductNameComparator;
import com.yash.collectionassignment.helper.ProductPriceComparator;
import com.yash.collectionassignment.pojo.Product;
/**
 * Creating Main App for Product which include implementation of HashSet, Clone, 
 * ArrayList and sorting
 * @author madhav.machiwal
 *
 */
public class ShoppingApp 
{
	public static void main(String[] args) 
	{
		HashSet<Product> set = new HashSet<>();
		Product pr1 = new Product(101, "TV", 10600.09);
		Product pr2 = new Product(102, "Mobile", 12000.80);
		Product pr3 = new Product(301, "Laptop", 40000.00);
		Product pr4 = new Product(407, "Desktop", 22206.34);
		Product pr5 = new Product(305, "Keyboard", 1000.07);
		Product pr6 = new Product(407, "Desktop", 22206.34);
		set.add(pr1);
		set.add(pr2);
		set.add(pr3);
		set.add(pr4);
		set.add(pr5);
		set.add(pr6); 	// Duplication not allowed
		//	set.add(null);

		for(Product p : set)
		{
			System.out.println(p.productId+" "+p.productName+" "+p.productPrice);
		}

		System.out.println("Collection Size: "+set.size());
	
		HashSet clone = new HashSet();
		clone = (HashSet)set.clone();
		System.out.println("Clone set: "+clone);
		
		List<Product> list = new ArrayList<Product>(set);
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
		
		Collections.sort(list, new ProductIdComparator());
		System.out.println("Sorted by Product Id: ");
		for(Product p : list)
		{
			System.out.println(p.productId+" "+p.productName+" "+p.productPrice);
		}
		
		System.out.println("Get the first product of the list: ");
		System.out.println(list.get(0));
		
		System.out.println("Get the Last product of the list: ");
		System.out.println(list.get(list.size()-1));
		
		Collections.sort(list, new ProductNameComparator());
		System.out.println("Sorted by Product Name: ");
		for(Product p : list)
		{
			System.out.println(p.productId+" "+p.productName+" "+p.productPrice);
		}
		
		Collections.sort(list, new ProductPriceComparator());
		System.out.println("Sorted by Product Price: ");
		for(Product p : list)
		{
			System.out.println(p.productId+" "+p.productName+" "+p.productPrice);
		}
		
	}

}
