package com.yash.dealerinformation;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
/**
 * Dealer App using concepts of jdbc and CRUD operations;
 * @author madhav.machiwal
 *
 */
public class DealerApp 
{
	static Logger logger = Logger.getAnonymousLogger();
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dealer_information", "root", "root");
		logger.info("Data Base Connected");

		String str = "insert into dealer(reg_num, shop_name, owner_name) values(?, ?, ?)";
		//	PreparedStatement pst = (PreparedStatement) con.prepareStatement(str);

		/*	pst.setInt(1, 101);
		pst.setString(2, "Traders ltd.");
		pst.setString(3, "Madhav");	
		pst.executeUpdate();	

		pst.setInt(1, 102);
		pst.setString(2, "Star ltd.");
		pst.setString(3, "Atul");
		pst.executeUpdate();

		pst.setInt(1, 103);
		pst.setString(2, "Lion ltd.");
		pst.setString(3, "Madhav");
		pst.executeUpdate();	*/

		String str1 = "insert into Product(pro_id, pro_name, pro_price) values(?, ?, ?)";
		/*	PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(str1);

		pst1.setInt(1, 1);
		pst1.setString(2, "Mobile");
		pst1.setDouble(3, 60000);
		pst1.executeUpdate();

		pst1.setInt(1, 2);
		pst1.setString(2, "Laptop");
		pst1.setDouble(3, 50000);
		pst1.executeUpdate();

		pst1.setInt(1, 3);
		pst1.setString(2, "Desktop");
		pst1.setDouble(3, 20000);
		pst1.executeUpdate();	*/

		String str2 = "SELECT * FROM dealer d INNER JOIN product p ON d.pro_id = p.pro_id";
		//		String str3 = "update dealer set shop_name = 'Intex ltd.' where reg_num = 102"; 
		//		String str4 = "delete from product where pro_id = 2";
		Statement st = (Statement) con.createStatement();
		ResultSet rs = st.executeQuery(str2);
		while(rs.next())
		{
			logger.info(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7));
		}	
	}
}
