package com.yash.emsjdbc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.yash.emsjdbc.util.jdbc.JDBCUtil;

public class EmployeeDao extends JDBCUtil
{
	public void insert() throws SQLException
	{
		String sql = "insert into employee (employeeId, employeeName, employeeDepartment, EmployeeLocation, employeeSalary, employeeContact) values(?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = JDBCUtil.prepareStatement(sql);
		ps.setInt(1, 101);
		ps.setString(2, "Madhav");
		ps.setString(3, "IT");
		ps.setString(4, "Indore");
		ps.setDouble(5, 25000.00);
		ps.setString(6, "1234567890");
		ps.executeUpdate();
		
	}
}
