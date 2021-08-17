package com.yash.oopsassignment1;
/**
 * 
 * @author Madhav Machiwal
 *
 */
public class Employee 
{
	private int emp_id;
	private String emp_name;
	private String emp_designation;
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_designation() {
		return emp_designation;
	}

	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}
	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_designation=" + emp_designation + "]";
	}

	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.setEmp_id(10105);
		emp.setEmp_name("Madhav Machiwal");
		emp.setEmp_designation("System Engineer");
		
		emp.getEmp_id();
		emp.getEmp_name();
		emp.getEmp_designation();
		
		System.out.println(emp.toString());

	}

}
