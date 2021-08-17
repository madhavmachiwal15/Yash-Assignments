package com.yash.dogs;
/**
 * Creating sub-class Yorkshire and implements abstract method
 * @author Madhav Machiwal
 *
 */
public class Yorkshire extends Dog
{
	final int avgBreedWeight=7;
	private String name;
	private String color;
	
	Yorkshire(String name, String color)
	{
		System.out.println("This is Yorkshire Constructor");
		this.name=name;
		this.color=color;
	}
	
	public void getYorkshireDetails()
	{
		System.out.println("Yorkshire Name is: "+name);
		System.out.println("Yorkshire color is: "+color);
	}
	

	@Override
	int avgBreedWeight() 
	{
		return avgBreedWeight;
	}
}
