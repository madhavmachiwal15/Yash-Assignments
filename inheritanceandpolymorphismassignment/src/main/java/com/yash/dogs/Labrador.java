package com.yash.dogs;
/**
 * Creating sub-class Labrador which implements abstract method
 * @author Madhav Machiwal
 *
 */
public class Labrador extends Dog
{
	final int avgBreedWeight=29;
	private String name;
	private String color;
	
	Labrador(String name, String color)
	{
		System.out.println("This is a Labrador Constructor");
		this.name=name;
		this.color=color;
	}
	
	public void getLabradorDetails()
	{
		System.out.println("Labrador name is: "+name);
		System.out.println("Labrador Color is: "+color);
	}

	@Override
	int avgBreedWeight() 
	{
		return avgBreedWeight;
	}
}
