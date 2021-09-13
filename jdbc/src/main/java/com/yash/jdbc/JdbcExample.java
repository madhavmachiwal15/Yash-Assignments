package com.yash.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;


public class JdbcExample 
{
	static Logger logger = Logger.getLogger(JdbcExample.class);
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");		
		logger.info("DataBase Connected");
		//	Statement st = (Statement) con.createStatement();
		String str = "insert into company(com_id, com_name, country, salary) values(?, ?, ?, ?)";
		PreparedStatement pst = (PreparedStatement) con.prepareStatement(str);

		pst.setInt(1, 302);
		pst.setString(2, "Mahindra");
		pst.setString(3, "Japan");
		pst.setDouble(4, 78000);
		pst.addBatch();
		
		pst.setInt(1, 900);
		pst.setString(2, "Microsoft");
		pst.setString(3, "US");
		pst.setDouble(4, 123000);
		pst.addBatch();
		
		
		pst.executeBatch();
		logger.info("Prepare statement executed!!");
		/*	ResultSet rs = pst.executeQuery("select * from company");
		while(rs.next())
		{
			logger.info(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}	*/
		con.close();
		pst.close();
		//	rs.close();
	}

}
