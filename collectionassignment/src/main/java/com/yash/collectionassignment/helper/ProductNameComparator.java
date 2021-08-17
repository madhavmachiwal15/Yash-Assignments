package com.yash.collectionassignment.helper;

import java.util.*;

import com.yash.collectionassignment.pojo.Product;
/**
 * Creating class to implements comparator interface
 * @author madhav.machiwal
 *
 */
public class ProductNameComparator implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) 
	{
		return p1.productName.compareTo(p2.productName);
	}

}
