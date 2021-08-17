package com.yash.emssystem.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yash.emssystem.exception.EmployeeIdNotFoundException;
import com.yash.emssystem.serviceimpl.EmployeeServiceImplementation;
import com.yash.emssystem.util.model.Employee;
/**
 * Main App of emplyoee which contains menu and methods calls according to
 * user input
 * @author madhav.machiwal
 *
 */
public class EmployeeApp 
{
	public static void main(String[] args) throws Exception
	{
		EmployeeServiceImplementation esimpl = new EmployeeServiceImplementation();
		int option;
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while(true)
		{
			System.out.println("Press 1 for Display existing list ");
			System.out.println("Press 2 for Add new Employee Record");
			System.out.println("Press 3 to get employee by id");
			System.out.println("Press 4 to get employee by name");
			System.out.println("Press 5 to get employee by maximum salary");
			System.out.println("Press 6 to get employee by minimum salary");
			System.out.println("Press any key(except 1-6) to exit...");

			option = sc.nextInt();
			switch(option)
			{
			case 1:
				esimpl.displayExistingData();
				break;

			case 2:
				esimpl.addEmployeeData();
				break;

			case 3:
				try 
				{
					esimpl.getEmployeeById();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;

			case 4:
				try 
				{
					esimpl.getEmployeeByName();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;

			case 5:
				esimpl.getEmployeeByMaxSalary();
				break;

			case 6:
				esimpl.getemployeeByMinSalary();
				break;

			default:
				flag = true;
				break;	
			}

			if(flag)
				break;

		}

	}
}
