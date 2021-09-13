package com.yash.hibernateinheritance.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/**
 * Model class Maths which is a child class of Subject
 * @author madhav.machiwal
 *
 */
@Entity
@DiscriminatorValue ("Subject_1")
public class Maths extends Subject
{
	private String name;
	private int marks;
	
	public String getName() {
		return name;
		/**
		 * return name of subject
		 */
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
		/**
		 * return marks of subject
		 */
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
