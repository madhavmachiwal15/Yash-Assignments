package com.yash.attribute_override.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@Column(name = "id")  
	int id;
	
	@Column(name = "name")
	String name;
	
	@Embedded
    @AttributeOverrides (
    {
    @AttributeOverride (name="state", column=@Column(name="State_Name")),
    @AttributeOverride (name="city", column=@Column(name="City_Name")),
    @AttributeOverride (name="pincode", column=@Column(name="Pincode_Number"))
    })
	EmployeeAddress address;
	
	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

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
	
	
	
}
