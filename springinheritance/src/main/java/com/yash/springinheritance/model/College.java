package com.yash.springinheritance.model;

public class College extends University
{
	private String collegeName;
	private String collegeRegistrationNumber;
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public String getCollegeRegistrationNumber() {
		return collegeRegistrationNumber;
	}
	
	public void setCollegeRegistrationNumber(String collegeRegistrationNumber) {
		this.collegeRegistrationNumber = collegeRegistrationNumber;
	}
	
}
