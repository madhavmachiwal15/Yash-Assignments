package com.yash.log4jdemo;

import org.apache.log4j.Logger;

public class LogDemo 
{
	static Logger logger = Logger.getLogger(LogDemo.class);
	public static void main(String[] args)
	{
		logger.info("Log for log demo1");
		System.out.println("Loggers executed......");

		logger.warn("Warning message");
		logger.error("Error Message");
		logger.debug("Debug Message");
		logger.fatal("Fatal Message");	
		div(10, 0);
		add(23, 7);
	}
	public static int div(int a ,int b)
	{
		int c;
		try 
		{
			c= a/b;
		}
		catch(Exception e)
		{
			logger.error("Division is: "+e);
		}
		return 0;
	}
	public static int add(int a ,int b)
	{
		int c = a+b;
		logger.info("Addition is: "+c);
		return c;
	}

}


