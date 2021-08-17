package com.yash.multithreadingpractice;

public class ThreadDemo3 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0 ; i<5; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) 
	{
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1();
		ThreadDemo1 t3 = new ThreadDemo1();
		
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		t2.start();
		t3.start();

	}

}
