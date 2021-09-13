package com.yash.springspel.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * creating model class SpelDemo contains its attributes
 * @author madhav.machiwal
 *
 */
@Component("demo")
public class SpelDemo
{
	@Value("#{12}")
	private int a;
	/**
	 * variable a type of integer
	 */
	
	@Value("#{23+45>67?1:0}")
	private int b;
	/**
	 * variable b type of integer
	 */
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "SpelDemo [a=" + a + ", b=" + b + "]";
	}
	
	
	
	
}
