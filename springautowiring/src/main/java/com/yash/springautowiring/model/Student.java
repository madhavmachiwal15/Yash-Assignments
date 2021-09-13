package com.yash.springautowiring.model;
/**
 * Model class Student contains two fields student name and subjects type of StudentDetails class
 * @author madhav.machiwal
 *
 */
public class Student 
{
	private StudentDetails studentName;
	private StudentDetails studentSubject;
	
	public StudentDetails getStudentName() {
		return studentName;
	}
	
	public void setStudentName(StudentDetails studentName) {
		this.studentName = studentName;
	}
	
	public StudentDetails getStudentSubject() {
		return studentSubject;
	}
	
	public void setStudentSubject(StudentDetails studentSubject) {
		this.studentSubject = studentSubject;
	}
	
	
}
