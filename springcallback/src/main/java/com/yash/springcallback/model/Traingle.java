package com.yash.springcallback.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Traingle implements InitializingBean, DisposableBean
{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw()
	{
		System.out.println("PointA is ("+pointA.getX()+", "+pointA.getY()+")");
		System.out.println("PointB is ("+pointB.getX()+", "+pointB.getY()+")");
		System.out.println("PointC is ("+pointC.getX()+", "+pointC.getY()+")");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("************destroy method****************");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("*****************afterPropertiesSet()*************************");
	}
	
}
