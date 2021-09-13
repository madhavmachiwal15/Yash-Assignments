package com.yash.springannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springannotation.model.Employee;

/**
 * Main Application implementing annotation based spring application
 * @author madhav.machiwal
 *
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Employee emp = appContext.getBean("employee", Employee.class);
		/**
		 * also can write in following way
		 */
		//	Employee emp = (Employee) appContext.getBean("employee");

		System.out.println("Employee ID: "+emp.getEmployeeId()+"\n"+
				"Employee Name: "+emp.getEmployeeName());


	}

}
