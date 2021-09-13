package com.yash.springsetterinjection.model;

public class Employee
{
	private long employeeId;
	private String employeeDesignation;
	private EmployeeName employeeName;
	
	
	public long getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	
	public EmployeeName getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(EmployeeName employeeName) {
		this.employeeName = employeeName;
	}
	
	
}
