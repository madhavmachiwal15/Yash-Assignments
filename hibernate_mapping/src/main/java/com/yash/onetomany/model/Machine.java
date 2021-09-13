package com.yash.onetomany.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * Model class Machine defines fields and use different types of annotations 
 * and use of one to many mapping
 * @author madhav.machiwal
 *
 */
@Entity
@Table(name = "Machine")
public class Machine {
	
	@Id
	@Column(name="Machine_Id")
	int id;
	@Column(name="Machine_Name")
	String name;
	
	@OneToMany(cascade = CascadeType.ALL) 
	@JoinColumn(name="id")
	List<Work> work;

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

	public List<Work> getWork() {
		return work;
	}

	public void setWork(List<Work> work) {
		this.work = work;
	}


	
	
}
