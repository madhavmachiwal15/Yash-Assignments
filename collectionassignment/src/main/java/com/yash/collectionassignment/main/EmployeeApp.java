package com.yash.collectionassignment.main;

import com.yash.collectionassignment.helper.EmployeeMapDao;
import com.yash.collectionassignment.pojo.Employee;

public class EmployeeApp 
{
	public static void main(String args[])
	{
		Employee emp = new Employee();
		emp.setId("IT101");
		
		EmployeeMapDao.addEmployeeToMap(emp);
		emp.setName("Madhav");
		emp.setDesignation("Tester");
		emp.setSalary(25000);
		emp.setDepartment("IT");
		
		EmployeeMapDao.displayEmployeeMap();
	}
}
