package com.yash.hibernatecriteria.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * Model class department with its fields and contains collection employee
 * @author madhav.machiwal
 *
 */
@Entity
@Table(name="Department")
public class Department 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Department_Id")
	private long id;

	@Column(name="Department_Name")
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
	private List<Employee> employees = new ArrayList<>();

	public long getId() {
		return id;
		/**
		 * return id of department
		 */
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
		/**
		 * return name of department
		 */
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
		/**
		 * return details of employee in form of collection
		 * details of employee are stores separetely in another class
		 */
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employees=" + employees + "]";
		/**
		 * return toString method to fetch the data
		 */
	}


}
