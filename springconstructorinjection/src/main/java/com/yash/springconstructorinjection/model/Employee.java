package com.yash.springconstructorinjection.model;

public class Employee 
{
	private long employeeId;
	private EmployeeName employeeName;
	private double employeeSalary;
	
	public Employee(long employeeId, EmployeeName employeeName, double employeeSalary)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public long getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
	public EmployeeName getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(EmployeeName employeeName) {
		this.employeeName = employeeName;
	}
	
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
}
