package com.yash.multithreadingpractice;

public class ThreadDemo4 extends Thread
{
	@Override
	public void run()
	{

		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread");
		}
		else
		{
			System.out.println("Thread n runs ....");
		}
	}
	public static void main(String[] args) 
	{
		ThreadDemo4 td1 = new ThreadDemo4();
		ThreadDemo4 td2 = new ThreadDemo4();
		ThreadDemo4 td3 = new ThreadDemo4();

		td1.setDaemon(true);
		td1.start();
		td1.stop();
		
		System.out.println("State of thraed 1: "+td1.getState());
		td2.setDaemon(true);
		td2.start();

		td3.start();
	}

}
