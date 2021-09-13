package com.yash.emsjdbc.util.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUtil 
{
	public static PreparedStatement prepareStatement(String sql)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
			System.out.println("Database connected!!");
			PreparedStatement ps = con.prepareStatement(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
		
	}
}
