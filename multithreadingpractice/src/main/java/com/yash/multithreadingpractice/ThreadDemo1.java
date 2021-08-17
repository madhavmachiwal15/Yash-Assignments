package com.yash.multithreadingpractice;
/**
 * Multithreading by extending thread class
 * @author madhav.machiwal
 *
 */
public class ThreadDemo1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thread Name of run method "+Thread.currentThread().getName());
		System.out.println("Thread id of run method "+Thread.currentThread().getId());
		System.out.println("Thread state: "+Thread.currentThread().getState());
		
	/*	try 
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	*/
	}
	public static void main(String[] args) 
	{
	/*	for(int i=0; i<5; i++)
		{
			ThreadDemo1 td = new ThreadDemo1();
			td.start();
		}	*/
		
		ThreadDemo1 td1 = new ThreadDemo1();
		ThreadDemo1 td2 = new ThreadDemo1();
		ThreadDemo1 td3 = new ThreadDemo1();
		td1.setName("MyThread1");
		td2.setName("MyThread2");
		td3.setName("MyThread3");
		//td1.run();
		td1.start();
		td2.start();
		td3.start();
		

		//System.out.println("Current Thread Id: "+Thread.currentThread().getId());
		//System.out.println("Current Thread Name: "+Thread.currentThread().getName());
	}

}
