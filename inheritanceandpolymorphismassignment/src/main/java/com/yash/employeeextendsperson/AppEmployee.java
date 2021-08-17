package com.yash.employeeextendsperson;
/**
 * Main method for employee extends person
 * @author Madhav Machiwal
 *
 */
public class AppEmployee 
{
	public static void main(String[] args)
	{
		Employee emp = new Employee("Madhav Machiwal", 25000.10, 2021, "10236541289");
		System.out.println(emp.toString());
	}

}
