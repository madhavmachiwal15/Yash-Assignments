package com.yash.multithreadingpractice;

public class ThreadDemo6 
{
	synchronized void getProductList()
	{
		System.out.println("Get List Of Products...");
		
		try
		{
			wait();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	synchronized void addProducts()
	{
		System.out.println("Add Products....");
		try
		{
			wait();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	synchronized void verifyCart()
	{
		System.out.println("Verify Cart....");
		try
		{
			wait();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	synchronized void confirmPayment()
	{
		System.out.println("Confirm Payment....");
		
		try
		{
			wait();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	synchronized void printReciept()
	{
		System.out.println("Print Reciept....");
		
		notify();
	}
	public static void main(String[] args)
	{
		final ThreadDemo6 obj = new ThreadDemo6();
		new Thread()
		{
			public void run()
			{
				obj.getProductList();
			}
		}.start();

		new Thread()
		{
			public void run()
			{
				obj.addProducts();
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				obj.verifyCart();
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				obj.confirmPayment();
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				obj.printReciept();
			}
		}.start();
	}

}
