package com.yash.jdk8features;
/**
 * Example of functional interface usging default, abstract and static method
 * @author madhav.machiwal
 *
 */
@FunctionalInterface
interface Showable
{
	public void show1();
	public default void show2()
	{
		System.out.println("Inside show 2.....");
	}
	
	public static void show3()
	{
		System.out.println("Inside static show 3.....");
	}
}
public class FunctionalInterfaceDemo2 implements Showable
{
	public static void main(String[] args)
	{
		FunctionalInterfaceDemo2 fi = new FunctionalInterfaceDemo2();
		fi.show1();
		fi.show2();	// call override show 2 method
		Showable.show3();
		fi.show3();
	}

	@Override
	public void show1() 
	{
		System.out.println("Inside abstract Show 1 method override.....");
		
	}
	
	public void show2()
	{
		System.out.println("Inside show 2 override.....");
	}
	
	public static void show3()
	{
		System.out.println("Inside static show 3 override.....");
	}

}
