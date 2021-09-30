package com.yash.ems.serviceimpl;

import java.sql.ResultSet;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;
//import com.yash.emsjdbc.daoimpl.EmployeeDaoImpl;
import com.yash.ems.util.GetConnection;
/**
 * EmployeeServiceImpl class implements EmployeeService Interface
 * and Override its unimplemented methods
 * @author madhav.machiwal
 *
 */
public class EmployeeServiceImpl implements EmployeeService
{
	/**
	 * logger instance to print logs on console and in file
	 */
	Logger logger = Logger.getLogger(EmployeeServiceImpl.class);

	/**
	 * EmployeeService Interface contains declaration of searchEmployeeById method
	 * his method is use to search employee by given id (given by user)
	 * 
	 */
	@Override
	public Employee searchEmployeeById(int eid) 
	{
		Employee e = null;

		try(Connection con = GetConnection.getConn();
				PreparedStatement pst = (PreparedStatement) con.prepareStatement
						("select * from employee where id=?");)
		{
			pst.setInt(1, eid);
			ResultSet rs = pst.executeQuery();

			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				Double salary = rs.getDouble(3);
				String department = rs.getString(4);
				String designation = rs.getString(5);
				String address = rs.getString(6);

				e = new Employee(id,name,salary,department,designation,address);

			}

			return e;
		}
		catch(Exception e1)
		{
			logger.warn("Id can not be found!!");
			e1.printStackTrace();
		}

		return null;

	}



}


