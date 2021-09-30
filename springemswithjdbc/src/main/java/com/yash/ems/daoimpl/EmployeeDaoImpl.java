package com.yash.ems.daoimpl;

/**
 * Class EmployeeDaoImpl implements interface EmployeeDao and
 * override its unimplemented methods
 */

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.yash.ems.dao.EmployeeDao;
import com.yash.ems.model.Employee;
import com.yash.ems.daoimpl.EmployeeDaoImpl;
import com.yash.ems.util.GetConnection;

public class EmployeeDaoImpl implements EmployeeDao
{
	/**
	 * logger instance to print logs on console and in file
	 */
	Logger logger = Logger.getLogger(EmployeeDaoImpl.class);

	/**
	 * saveEmployee method implementation which is declared in EmployeeDao Interface
	 * this method insert employee details into database
	 */
	@Override
	public void saveEmployee(Employee employee)
	{
		try(Connection con = GetConnection.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement
				("insert into employee(id,name,salary,department,designation,address) values(?,?,?,?,?,?)");) 
			{
				pst.setLong(1, employee.getId());
				pst.setString(2, employee.getName());
				pst.setDouble(3, employee.getSalary());
				pst.setString(4, employee.getDepartment());
				pst.setString(5, employee.getDesignation());
				pst.setString(6, employee.getAddress());
				pst.executeUpdate();
			
				logger.info("Record Inserted!!");
			
			}catch(Exception e)
			{
				logger.warn("Record can not be inserted!! Check Again..");
				e.printStackTrace();
			}
	}

	/**
	 * getEmployeeList method implementation which is declared in EmployeeDao Interface
	 * this method fetch the details from database and print on browser
	 */
	@Override
	public List<Employee> getEmployeeList() {
		try(Connection con = GetConnection.getConn();
				Statement st = con.createStatement();)
		{
			List<Employee> emplist = new ArrayList<Employee>();
			String q1="select * from employee";
			
			ResultSet rs = st.executeQuery(q1);
			while(rs.next())
			{
				Long id = rs.getLong(1);
				String name = rs.getString(2);
				Double salary = rs.getDouble(3);
				String department = rs.getString(4);
				String designation = rs.getString(5);
				String address = rs.getString(6);
				
				Employee e = new Employee(id,name,salary,department,designation,address);
				
				emplist.add(e);
				
			}
			return emplist;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	/**
	 * updateEmployee method implementation which is declared in EmployeeDao Interface
	 * this method is use to update employee details in database as per given employee id 
	 */
	@Override
	public void updateEmployee(Employee employee) 
	{
		try(Connection con = GetConnection.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement
				("update employee set name=?,salary=?,department=?,designation=?,address=? where id=?");) 
			{
				pst.setLong(1, employee.getId());
				pst.setString(1, employee.getName());
				pst.setDouble(2, employee.getSalary());
				pst.setString(3, employee.getDepartment());
				pst.setString(4, employee.getDesignation());
				pst.setString(5, employee.getAddress());
				pst.setLong(6, employee.getId());
				pst.executeUpdate();
				
				logger.info("Record updated successfully!!");
				
				
			}catch(Exception e)
			{
				logger.warn("Record Can not be updated!! something is wrong... ");
				e.printStackTrace();
			}
		
		
	}

	/**
	 * deleteEmployee method implementation which is declared in EmployeeDao Interface
	 * this method is use to delete employee details in database as per given employee id 
	 */
	@Override
	public void deleteEmployee(int eid) 
	{
		
		try(Connection con = GetConnection.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement
				("delete from employee where id=?");)
			{
				pst.setInt(1, eid);
				int i = pst.executeUpdate();
				logger.info("Record Deleted!!");
				
			}
			catch(Exception e)
			{
				logger.warn("Record Can not be deleted!! something is wrong... ");
				e.printStackTrace();
			}
			
		
	}

}
