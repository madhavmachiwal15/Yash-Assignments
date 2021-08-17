package com.yash.reflectionapi;

public class TestMain 
{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		Class c = Class.forName("com.yash.reflectionapi.Test");
		Test t = (Test) c.newInstance();

	}

}
