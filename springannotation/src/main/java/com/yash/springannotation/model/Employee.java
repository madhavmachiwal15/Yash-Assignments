package com.yash.springannotation.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * model class employee contains fields and using annotaions to fix a value
 * @author madhav.machiwal
 *
 */
@Component("employee")
public class Employee 
{
	@Value("101")
	private int employeeId;
	/**
	 * employeeId(int type) for class Employee
	 */
	
	@Value("Madhav")
	private String employeeName;
	/**
	 * employeeName(String type) for class Employee
	 * @return
	 */

	public int getEmployeeId() {
		return employeeId;
		/**
		 * return employeeId from Employee
		 */
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
		/**
		 * return employeeName from Employee
		 */
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
}
