package com.yash.jdk8features.streamapiandtimeapi;

public class Student
{
	long studentRollNumber;
	String studentName;
	String subject;
	long totalMarks;
	
	public Student(long studentRollNumber, String studentName, String subject, long totalMarks)
	{
		this.studentRollNumber = studentRollNumber;
		this.studentName = studentName;
		this.subject = subject;
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [studentRollNumber=" + studentRollNumber + ", studentName=" + studentName + ", subject="
				+ subject + ", totalMarks=" + totalMarks + "]";
	}
	
	
}
