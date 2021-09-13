package com.yash.springautowiring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springautowiring.model.Student;

public class MainApp {

	public static void main(String[] args) 
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Student std = (Student) appContext.getBean("Student");
		
		String firstName = std.getStudentName().getFirstName();
		String lastName = std.getStudentName().getLastName();
		String firstSubject = std.getStudentSubject().getFirstSubject();
		String secondSubject = std.getStudentSubject().getSecondSubject();
		String thirdSubject = std.getStudentSubject().getThirdSubject();
		String fourthSubject = std.getStudentSubject().getFourthSubject();
		
		System.out.println("*************Student Details***************");
		System.out.println("Student Name: "+firstName+" "+lastName+"\n"+
							"Student Subjects: "+"\n"+
							firstSubject+"\n"+secondSubject+"\n"+
							thirdSubject+"\n"+fourthSubject);
		
		System.out.println("*******************************************");
		

	}

}
