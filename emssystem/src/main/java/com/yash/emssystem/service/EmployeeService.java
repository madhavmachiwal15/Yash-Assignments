package com.yash.emssystem.service;
/**
 * Interface EmplyoeeService where all required methods are declared
 * @author madhav.machiwal
 *
 */
public interface EmployeeService 
{
	public void displayExistingData();
	public void addEmployeeData();
	public void getEmployeeById() throws Exception;
	public void getEmployeeByName() throws Exception;
	public void getEmployeeByMaxSalary();
	public void getemployeeByMinSalary();
}
