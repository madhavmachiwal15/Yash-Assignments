package com.yash.emssystem.util.model;
/**
 * Creating a pojo class of employee which contains fields, constructor,
 * getter and setter methods.
 * @author madhav.machiwal
 *
 */
public class Employee 
{
	long employeeId;
	String employeeName;
	String employeeDepartment;
	String employeeLocation;
	double employeeSalary;
	String employeeContact;

	public Employee(long employeeId, String employeeName, String employeeDepartment, String employeeLocation, double employeeSalary, String employeeContact)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName; 
		this.employeeDepartment = employeeDepartment;
		this.employeeLocation = employeeLocation;
		this.employeeSalary = employeeSalary;
		this.employeeContact = employeeContact;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeLocation() {
		return employeeLocation;
	}

	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeContact() {
		return employeeContact;
	}

	public void setEmployeeContact(String employeeContact) {
		this.employeeContact = employeeContact;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
				+ employeeDepartment + ", employeeLocation=" + employeeLocation + ", employeeSalary=" + employeeSalary
				+ ", employeeContact=" + employeeContact + "]";
	}


}
