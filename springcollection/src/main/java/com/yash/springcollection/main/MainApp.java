package com.yash.springcollection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springcollection.model.Company;

public class MainApp {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Company cmp = (Company) appContext.getBean("CompanyBean");
		
		String department = cmp.getDepartment();
		System.out.println("Department Name: "+department);
		cmp.printListOfEmployees();

	}

}
