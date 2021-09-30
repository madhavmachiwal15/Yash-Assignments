package com.yash.ems.model;

/**
 * Model class Employee contains its attributes, parametrized constructor, getter and setter
 * methods and toString method
 */
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Employee 
{
	/**
	 * Id of employee
	 */
	private long id;
	
	/**
	 * Name of Employee
	 */
	@Size(min=3, max=30) 
	@NotEmpty
	private String name;

	/**
	 * Salary of employee
	 */
	private double salary;
	
	/**
	 * Department of Employee
	 */
	@NotEmpty
	private String department;
	
	/**
	 * Designation of employee
	 */
	@NotEmpty
	private String designation;
	
	/**
	 * Address of Employee
	 */
	@NotEmpty
	private String address;
	
	/**
	 * Default Constructor for employee
	 */
	public Employee() {
		super();
	}

	/**
	 * Parametrized constructor for employee
	 * @param id
	 * @param name
	 * @param salary
	 * @param department
	 * @param designation
	 * @param address
	 */
	public Employee(long id, String name, double salary, String department, String designation, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.designation = designation;
		this.address = address;
	}

	/**
	 * getter and setter methods for attributes of employee
	 * @param id
	 */
	public long getId() {
		return id;
		/**
		 * return id of employee
		 */
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
		/**
		 * return name of employee
		 */
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
		/**
		 * return salary of employee
		 */
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
		/**
		 * return department of employee
		 */
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
		/**
		 * return designation of employee
		 */
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
		/**
		 * return address of employee
		 */
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * toString() method
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", designation=" + designation + ", address=" + address + "]";
	}
	

	
}
