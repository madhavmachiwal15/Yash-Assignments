package com.yash.dogs;
/**
 * Main Method
 * @author Madhav Machiwal
 *
 */
public class DogTest 
{
	public static void main(String[] args) 
	{
		Labrador ld = new Labrador("Tom", "Black");
		
		ld.getLabradorDetails();
		System.out.println("Average Weight of Labrador: "+ld.avgBreedWeight());
		
		System.out.println();
		Yorkshire yk = new Yorkshire("Spike", "White");
		yk.getYorkshireDetails();
		System.out.println("Average Weight of Yorkshire: "+yk.avgBreedWeight());

	}

}
