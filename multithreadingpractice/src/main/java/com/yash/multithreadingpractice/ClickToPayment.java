package com.yash.multithreadingpractice;

public class ClickToPayment extends Thread 
{
	@Override
	public void run()
	{
		System.out.println("Click for payment.............");

		/*	try
		{
			Thread.sleep(5000);
		}

		catch(Exception e)
		{
			System.out.println(e);
		}	*/	
	}
}
