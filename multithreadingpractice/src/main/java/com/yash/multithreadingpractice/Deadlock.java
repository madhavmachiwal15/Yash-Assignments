package com.yash.multithreadingpractice;

public class Deadlock extends Thread
{
	public static void main(String[] args) 
	{
		final String a = "a";
		final String b = "b";
		
		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				synchronized(a)
				{
					System.out.println("Thread 1...");
				}
				try
				{
					Thread.sleep(5000);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				synchronized(b)
				{
					System.out.println("Thread 2...");
				}
			}
		};
		
		t1.start();
		Thread t2 = new Thread()
		{
			@Override
			public void run()
			{
				synchronized(b)
				{
					System.out.println("Thread 2...");
				}
				try
				{
					Thread.sleep(5000);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				synchronized(a)
				{
					System.out.println("Thread 1...");
				}
			}
		};
		t2.start();

	}

}
