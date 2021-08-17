package com.yash.multithreadingpractice;

public class func implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread :"+Thread.currentThread().getName());

	}

}
