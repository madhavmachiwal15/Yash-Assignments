package com.yash.multithreadingpractice;

public class ProductApp 
{
	public static void main(String[] args) 
	{
		GetListProducts glp = new GetListProducts();
		AddProduct ap = new AddProduct();
		VerifyTheCart vc = new VerifyTheCart();
		ClickToPayment cp =new ClickToPayment();
		
		glp.start();
		ap.start();
		vc.start();
		cp.start();

	}

}
