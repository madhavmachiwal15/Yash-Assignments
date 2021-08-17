package com.yash.jdk8features;
/**
 * Simple Lambda expression example
 * @author madhav.machiwal
 *
 */
interface Service
{
	public void message(String msg);
}
public class LambdaExpressionDemo3
{
	public static void main(String[] args) 
	{
		// without parenthesis
		Service s = msg ->{
			System.out.println("Message Read....."+msg);
		};
		s.message("Successfully!!");
	}
}
