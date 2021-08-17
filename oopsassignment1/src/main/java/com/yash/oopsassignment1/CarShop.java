package com.yash.oopsassignment1;
/**
 * Creating a class CarShop to showing details of cars
 * @author Madhav Machiwal
 *
 */
public class CarShop 
{
	private int speed;
	private String owner;
	private String cartype;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	
	@Override
	public String toString() {
		return "CarShop [speed=" + speed + ", owner=" + owner + ", cartype=" + cartype + "]";
	}
	
	public static void main(String args[])
	{
		CarShop cars = new CarShop();
		cars.setSpeed(120);
		cars.setOwner("Madhav Machiwal");
		cars.setCartype("Sedan");
		
		cars.getSpeed();
		cars.getOwner();
		cars.getCartype();
		
		System.out.println(cars.toString());
	}
}
