package com.yash.collectionassignment.helper;

import java.util.*;

import com.yash.collectionassignment.pojo.Product;
/**
 * Creating class to implements comparator interface
 * @author madhav.machiwal
 *
 */
public class ProductPriceComparator implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) 
	{
		if(p1.productPrice==p2.productPrice)
			return 0;
		else if(p1.productPrice > p2.productPrice)
			return 1;
		else 
			return -1;
	}
	
}
