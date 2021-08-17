package com.yash.multithreadingpractice;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerExample 
{
	public static void main(String[] args)
	{
		Timer t = new Timer();
		TimerTask ts = new TimerTask()
		{
			@Override
			public void run() 
			{
				final int a = 5;
				final int b = 9;
				int c;

				c = a+b;

				System.out.println("Sum: "+c);

			}	
		};

		t.schedule(ts, new Date());
		//t.schedule(ts, new Date(), 1000);

	}

}
