package com.yash.jdk8features;
/**
 * Example of functional interface using lambda expression
 * @author madhav.machiwal
 *
 */
interface Writeable
{
	public void write();
}
public class LambdaExpresionDemo1 
{
	public static void main(String[] args) 
	{
		Writeable w  = () ->{
			System.out.println("Writeable Interface");
		};
		
		w.write();	
	}

}
