package com.yash.hibernatecriteria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * Model class employee contains its fields
 * @author madhav.machiwal
 *
 */
@Entity
@Table(name="Employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Employee_Id")
	private long id;

	@Column(name="Employee_Name")
	private String name;

	@Column(name="Designation")
	private String designation;

	@ManyToOne
	@JoinColumn(name = "Department_Id")
	private Department department;

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

	public String getDesignation() {
		return designation;
		/**
		 * return designation of employee
		 */
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Department getDepartment() {
		return department;
		/**
		 * return department details of employee
		 * and department details are stored separetely in another class using mapping techniques
		 */
	}

	public void setDepartment(Department department) {
		this.department = department;
	}


}
