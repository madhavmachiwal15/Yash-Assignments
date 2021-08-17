package com.yash.carinformation.main;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
/**
 * CarApp using concepts of jdbc and using CRUD operations
 * @author madhav.machiwal
 *
 */
public class CarApp
{
	static Logger logger = Logger.getLogger(CarApp.class);
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/car_information", "root", "root");
				Statement st = (Statement) con.createStatement())
		{

			logger.info("DataBase Connected");


			st.execute("create table car(registration_number int not null primary key, owner_name varchar(70), type enum('Maruti', 'Hyndai'), engine_number int)");
	//		st.execute("create table engine(engine_number int not null primary key, model_year varchar(10), manufacturing_detail varchar(50))");
	//		st.execute("alter table car add engine_number int");
	//		st.execute("alter table car add foreign key(engine_number) references engine(engine_number)");
			st.execute("insert into car values(101, 'Madhav', 'Maruti', 78965)");
			st.execute("insert into car values(102, 'Atul', 'Hyundai', 90765)");
			st.execute("insert into car values(103, 'Arjun', 'Maruti', 89760)");
			st.execute("insert into car values(104, 'Manish', 'Maruti', 78654)");
			st.execute("insert into car values(105, 'Gagan', 'Hyundai', 67890)");		

			//	st.executeUpdate("update car set type = 'Hyundai' where registration_number = 103");

			//	st.execute("delete from car where registration_number = 104");

			ResultSet rs = st.executeQuery("select * from engine");
			while(rs.next())
			{
				logger.info(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}	

		}

	/*	catch(Exception  e)
		{
			e.printStackTrace();
		}	*/

	}

}
