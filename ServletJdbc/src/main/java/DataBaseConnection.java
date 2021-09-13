import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection 
{
	protected static Connection initializeDatabase()throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");		
		System.out.println("DataBase Connected");
		return con;
	}
}
