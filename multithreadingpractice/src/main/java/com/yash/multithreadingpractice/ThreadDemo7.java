package com.yash.multithreadingpractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo7
{
	public static void main(String[] args) 
	{
		ExecutorService service = Executors.newFixedThreadPool(5);
		//	ExecutorService service = Executors.newCachedThreadPool();
		for(int i=0; i<5; i++)
		{
			service.execute(new func());
		}
		//	service.execute(new func());
		System.out.println("Thread :"+Thread.currentThread().getName());
	}

}
