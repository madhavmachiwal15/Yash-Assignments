package com.yash.fetching.model;

import javax.persistence.Embeddable;
/**
 * 
 * @author madhav.machiwal
 *
 */
@Embeddable
public class Address {

	String city;
	String state;
	String pincode;
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
