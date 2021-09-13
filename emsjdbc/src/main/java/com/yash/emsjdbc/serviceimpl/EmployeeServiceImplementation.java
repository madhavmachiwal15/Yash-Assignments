package com.yash.emsjdbc.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.yash.emsjdbc.exception.EmployeeIdNotFoundException;
import com.yash.emsjdbc.exception.EmployeeNameNotFoundException;
import com.yash.emsjdbc.service.EmployeeService;
import com.yash.emsjdbc.util.model.Employee;
/**
 * Implementation of EmplyoeeSerivice Interface where all declared methods of interface
 * are overriden
 * @author madhav.machiwal
 *
 */
public class EmployeeServiceImplementation implements EmployeeService
{

	@Override
	public void displayExistingData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEmployeeData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEmployeeById() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEmployeeByName() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEmployeeByMaxSalary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getemployeeByMinSalary() {
		// TODO Auto-generated method stub
		
	}

/*	List<Employee> list = new ArrayList<>();
	public static List<Employee> listOfEmployee()
	{
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Madhav", "Testing", "Indore", 25000, "7896543229"));
		list.add(new Employee(102, "Arjun", "IT", "Pune", 25600, "9087665590"));
		list.add(new Employee(103, "Atul", "Developer", "Hyderabad", 27000, "9039678602"));
		list.add(new Employee(104, "Aman", "IT", "Bangaluru", 45000, "9899615892"));
		list.add(new Employee(105, "Ayush", "HR", "Pune", 22300, "7396159872"));
		return list;

	}	

	@Override
	public void displayExistingData() {
		List<Employee> list = listOfEmployee();
		for(Employee e: list)
		{
			System.out.println(e.toString());
		}

	}

	@Override
	public void addEmployeeData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		long empId = sc.nextLong();
		System.out.println("Enter employee name:  ");
		String empName = sc.next();
		System.out.println("Enter employee department:  ");
		String empDept = sc.next();
		System.out.println("Enter employee location:  ");
		String empLoct = sc.next();
		System.out.println("Enter employee salary:  ");
		double empSal = sc.nextDouble();
		System.out.println("Enter employee contact:  ");
		String empCont = sc.next();
		list.add(new Employee(empId, empName, empDept, empLoct, empSal, empCont));
		System.out.println(list);

	}

	@Override
	public void getEmployeeById() throws EmployeeIdNotFoundException
	{

		//In Jdk 8
		/*	List<Employee> list = listOfEmployee();
		boolean flag = false;
		System.out.println("Enter Employee Id: ");
		Scanner sc = new Scanner(System.in);
		long empId = sc.nextLong();
		System.out.println(list.stream()
				.filter(e -> e.getEmployeeId() == empId)
				.map(e ->e.toString())
				.collect(Collectors.toList()));		*/

	/*	// In JDK 7
		List<Employee> list = listOfEmployee();
		boolean flag = false;
		System.out.println("Enter Employee Id: ");
		Scanner sc = new Scanner(System.in);
		long empId = sc.nextLong();
		Iterator<Employee> i = list.iterator();
		while(i.hasNext())
		{
			Employee e = i.next();
			if(e.getEmployeeId() == empId)
			{
				System.out.println(e);
				flag = true;
			}
		}
		if(!flag)
		{
			throw new EmployeeIdNotFoundException("Employee Id not found!!");
		}

	}

	@Override
	public void getEmployeeByName() throws Exception 
	{
		// In JDK 7
		boolean flag=false;
		List<Employee> list = listOfEmployee();
		System.out.println("Enter Employee Name: ");
		Scanner sc = new Scanner(System.in);
		String empName = sc.next();
		Iterator<Employee> i = list.iterator();
		while(i.hasNext())
		{
			Employee e = i.next();
			if(e.getEmployeeName().equals(empName))
			{
				System.out.println(e);
				flag = true;
			}
		}

		if(!flag)
		{
			throw new EmployeeNameNotFoundException("Employee Name not found!!");
		}
		// In JDK 8
		/*	List<Employee> list = listOfEmployee();
		System.out.println("Enter Employee Name: ");
		Scanner sc = new Scanner(System.in);
		String empName = sc.next();
		System.out.println(list.stream()
				.filter(e -> e.getEmployeeName().equals(empName))
				.map(e ->e.toString())
				.collect(Collectors.toList())); 	*/	

/*	}	

	@Override
	public void getEmployeeByMaxSalary() 
	{
		List<Employee> list = listOfEmployee();
		System.out.println(list.stream()
				.max((emp1, emp2) -> emp1.getEmployeeSalary() > emp2.getEmployeeSalary()? 1: -1)
				.get());

	}

	@Override
	public void getemployeeByMinSalary() 
	{
		List<Employee> list = listOfEmployee();
		System.out.println(list.stream()
				.min((emp1, emp2) -> emp1.getEmployeeSalary() > emp2.getEmployeeSalary()? 1: -1)
				.get());

	}

		
*/

}
