package com.yash.jdk8features;
/**
 * functional interface example without using lambda expression and using anonymous class
 * @author madhav.machiwal
 *
 */

interface Readable
{
	public void read();
}
public final class FunctionalInterfaceDemo1 
{
	public static void main(String[] args) 
	{
		Readable w = new Readable()
		{
			public void read()
			{
				System.out.println("Readable Interface");
			}
		};

		w.read();

	}

	

}
