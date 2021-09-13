package com.yash.onetomany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MachineWorking")
public class Work {

	@Id
	@Column(name="Machine_Id")
	int id;
	
	@Column(name="Machine_Work")
	String work;
	
	@Column(name="Machine_Made_By")
	String made_by;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getMade_by() {
		return made_by;
	}

	public void setMade_by(String made_by) {
		this.made_by = made_by;
	}
	
	
}
