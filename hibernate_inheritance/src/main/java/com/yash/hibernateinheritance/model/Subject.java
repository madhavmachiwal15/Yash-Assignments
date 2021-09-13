package com.yash.hibernateinheritance.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
/**
 * Model class subject which is also a parent class
 * @author madhav.machiwal
 *
 */
@Entity
@Table(name = "Subject")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn (name = "Identity", discriminatorType= DiscriminatorType.STRING)
public class Subject 
{
	@Id
	@GeneratedValue
	private int id;
	private String type;
	
	public int getId() {
		return id;
		/**
		 * return id of subject
		 */
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
		/**
		 * return type of subject
		 */
	}
	public void setType(String type) {
		this.type = type;
	}

}
