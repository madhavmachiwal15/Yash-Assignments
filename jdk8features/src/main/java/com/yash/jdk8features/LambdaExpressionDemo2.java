package com.yash.jdk8features;
/**
 * Lambda expression for basic calculator using exception handling
 * @author madhav.machiwal
 *
 */
interface Calculator
{
	public int calculate(int a, int b);
}
public class LambdaExpressionDemo2 
{
	public static void main(String[] args) 
	{
		Calculator add = (a, b) ->{
			return a+b;
		};
		System.out.println("Addition: "+add.calculate(9, 5));

		Calculator sub = (a,b) ->	a-b;	// implicitly return type
	
		System.out.println("Substraction: "+sub.calculate(8, 1));

		Calculator mult = (a,b) -> a*b; // implicitly return type

		System.out.println("Multiplication: "+mult.calculate(3, 6));

		Calculator div = (a,b) ->{
			return a/b;
		};
		System.out.println("Division: "+div.calculate(8, 4));
	}
}
