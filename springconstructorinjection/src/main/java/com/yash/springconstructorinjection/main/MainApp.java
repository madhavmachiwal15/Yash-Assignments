package com.yash.springconstructorinjection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springconstructorinjection.model.Employee;

public class MainApp {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Employee emp = (Employee) appContext.getBean("EmployeeBean");
		long id = emp.getEmployeeId();
		double salary = emp.getEmployeeSalary();
		String firstName = emp.getEmployeeName().getFirstName();
		String lastName = emp.getEmployeeName().getLastName();
		
		System.out.println("***************Employee Details***************");
		System.out.println("Employee ID: "+id+"\n"+
							"Employee Name: "+firstName+" "+lastName+"\n"+
							"Employee Salary: "+salary);
		
		System.out.println("**********************************************");
	}

}
