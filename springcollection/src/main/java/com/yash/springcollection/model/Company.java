package com.yash.springcollection.model;

import java.util.List;

public class Company 
{
	private String department;
	private List<String> listOfEmployees;
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public List<String> getListOfEmployees() {
		return listOfEmployees;
	}

	public void setListOfEmployees(List<String> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}

	public void printListOfEmployees()
	{
		System.out.println("List Of Employees: ");
		for(String names: listOfEmployees)
		{
			System.out.println(names);
		}
	}
}
