package com.yash.springcodetointerface.model;

import com.yash.springcodetointerface.service.Shape;

/**
 * Class Line implemets interface Shape and its unimplemented method draw.
 * @author madhav.machiwal
 *
 */
public class Line implements Shape 
{

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Line is drawn by: "+getX()+" "+getY());
	}
	
}
