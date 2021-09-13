package com.yash.springfirstdemo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.springfirstdemo.config.ApplicationConfiguration;
import com.yash.springfirstdemo.model.Student;

public class StudentApp {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Student studentObj = (Student) appContext.getBean("studentObject");
		
		long studentId = studentObj.getStudentId();
		String studentName = studentObj.getStudentName();
		String studentStandard = studentObj.getStudentStandard();
		
		System.out.println("***********Student Details*************");
		System.out.println("Student ID: "+studentId+"\n"+
						   "Student Name: "+studentName+"\n"+	
						   "Student Standard: "+studentStandard);
		
		System.out.println("***************************************");
		
		

	}

}
