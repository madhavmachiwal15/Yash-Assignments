package com.yash.springinheritance.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springinheritance.model.College;

public class MainApp {

	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		College clg = (College) appContext.getBean("CollegeBean"); 
		
		System.out.println("College Registration Number: "+clg.getCollegeRegistrationNumber());
		System.out.println("College Name: "+clg.getCollegeName());
		System.out.println("University Name: "+clg.getUniversityName());
		System.out.println("University Type: "+clg.getUniversityType());
	}

}
