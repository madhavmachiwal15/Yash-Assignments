package com.yash.hibernatecollection.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Model class employee store fields and collection
 * @author madhav.machiwal
 *
 */
@Entity
@Table(name="EmployeeDetails")
public class Employee
{
	@Id
	@Column(name="id", columnDefinition="INTEGER")
	int id;
	
	@Column(name="name", columnDefinition="VARCHAR(50)")
	String name;
	
	@ElementCollection
	Set<Location> loc = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Location> getLoc() {
		return loc;
	}

	public void setLoc(Set<Location> loc) {
		this.loc = loc;
	}
	


}
