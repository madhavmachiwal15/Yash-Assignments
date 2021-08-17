package com.yash.calculator;
import java.util.*;
public class Arthematic implements Calculator
{

	int a, b;
	@Override
	public int square()
	{
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		b=a*a;
		
		return b;
	}

}
