package com.yash.ems.dao;

import java.util.List;

import com.yash.ems.model.Employee;

/**
 * Interface EmployeeDao contains declaration of basic CRUD operation methods
 * @author madhav.machiwal
 *
 */

public interface EmployeeDao 
{
	
	/**
	 * this method is used to save employee data in database
	 * @param employee
	 */
	public void saveEmployee(Employee employee);
	
	/**
	 * this method is used to update employee data in database
	 * @param employee
	 */
	public void updateEmployee(Employee employee);
	
	/**
	 * this method is used to delete employee data from database
	 * @param eid
	 */
	public void deleteEmployee(int eid);
	

	/**
	 * this method is used to fetch employee data from database
	 * @return
	 */
	public List<Employee> getEmployeeList();
}
