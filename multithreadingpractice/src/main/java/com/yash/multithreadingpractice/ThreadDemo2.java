package com.yash.multithreadingpractice;

public class ThreadDemo2 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thread Name: "+Thread.currentThread().getPriority());
	//	System.out.println("Is Alive?: "+Thread.currentThread().isAlive());
	}
	public static void main(String[] args) 
	{
		ThreadDemo2 td1 = new ThreadDemo2();
		ThreadDemo2 td2 = new ThreadDemo2();
		ThreadDemo2 td3 = new ThreadDemo2();
		ThreadDemo2 td4 = new ThreadDemo2();
		
		td1.setPriority(Thread.MIN_PRIORITY);
		td2.setPriority(Thread.MAX_PRIORITY);
		td3.setPriority(Thread.NORM_PRIORITY);
		
		td1.start();
	//	td1.stop();
		td2.start();
		td3.start();
		td4.start();
	
		td4.interrupt();
		
		System.out.println("Is Alive?: "+td1.isAlive());
		System.out.println("Is Alive?: "+td2.isAlive());
		System.out.println("Is Alive?: "+td3.isAlive());
		
		System.out.println("State of td4: "+td4.getState()+"td4 is alive? "+td4.isAlive());
	}

}
