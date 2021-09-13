package com.yash.hibernatecaching.model;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
/**
 * Model class employee contains its fields
 * @author madhav.machiwal
 *
 */
@Entity
@Table(name="Employee1")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
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
	
	@Column(name="Salary")
	private double salary;

	public double getSalary() {
		return salary;
		/**
		 * return salary of employee
		 */
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
}
