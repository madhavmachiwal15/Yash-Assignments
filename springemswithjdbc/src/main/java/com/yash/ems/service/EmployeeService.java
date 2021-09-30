package com.yash.ems.service;

import com.yash.ems.model.Employee;

/**
 * EmployeeService Interface contains service methods declarations
 * @author madhav.machiwal
 *
 */

public interface EmployeeService 
{
	/**
	 * this method is used to search employees by their id
	 * @param eid
	 * @return
	 */
	public Employee searchEmployeeById(int eid);
	
}
