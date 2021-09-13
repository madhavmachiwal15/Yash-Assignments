package com.yash.hibernatecollection.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * Embeddable class location store sub-data of location field(in employee class)
 * @author madhav.machiwal
 *
 */
@Embeddable
public class Location {

	@Column(name="CITY", columnDefinition="VARCHAR(50)")
	String city;
	@Column(name="STATE", columnDefinition="VARCHAR(50)")
	String state;
	@Column(name="PINCODE", columnDefinition="VARCHAR(50)")
	String pincode;
	
	public Location(String city, String state, String pincode)
	{
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Location() {
		// TODO Auto-generated constructor stub
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
