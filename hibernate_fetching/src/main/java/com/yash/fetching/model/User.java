package com.yash.fetching.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Model class user showing concepts of fetching type and etc..
 * @author madhav.machiwal
 *
 */
@Entity
@Table(name="Userdetails")
public class User 
{
	@Id
	int id;
	String name;
	
	@ElementCollection(fetch=FetchType.EAGER)
	Collection<Address> listofaddress = new ArrayList<Address>();

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

	public Collection<Address> getListofaddress() {
		return listofaddress;
	}

	public void setListofaddress(Collection<Address> listofaddress) {
		this.listofaddress = listofaddress;
	}
	
}
