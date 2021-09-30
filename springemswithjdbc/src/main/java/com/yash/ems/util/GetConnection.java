package com.yash.ems.util;

/**
 * GetConnection class stored connection with database through JDBC and create its instance
 */

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class GetConnection 
{
	public static Connection getConn()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employeedb";
			Connection con = (Connection) DriverManager.getConnection(url,"root","root");
			return con;
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
	
		return null ;
		
	}
	
}
