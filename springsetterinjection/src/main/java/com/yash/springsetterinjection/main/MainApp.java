package com.yash.springsetterinjection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springsetterinjection.model.Employee;

public class MainApp {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Employee emp = (Employee) appContext.getBean("EmployeeBean");
		long id = emp.getEmployeeId();
		String firstName = emp.getEmployeeName().getFirstName();
		String lastName = emp.getEmployeeName().getLastName();
		String designation = emp.getEmployeeDesignation();
		
		System.out.println("***********Employee Details************");
		System.out.println("Employee ID: "+id+"\n"+
							"Employee Name: "+firstName+" "+lastName+"\n"+
							"Employee Designation: "+designation);
		
		System.out.println("***************************************");
	}

}
