package com.yash.springfirstdemo.model;

public class Student 
{
	private long studentId; 
	private String studentName;
	private String studentStandard;
	
	public Student(long studentId, String studentName, String studentStandard)
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentStandard = studentStandard;	
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentStandard() {
		return studentStandard;
	}

	public void setStudentStandard(String studentStandard) {
		this.studentStandard = studentStandard;
	}

}
