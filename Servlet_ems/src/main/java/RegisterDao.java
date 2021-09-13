import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class RegisterDao 
{
	private String dburl ="jdbc:mysql://localhost:3306/empdb";
	private String dbname ="root";
	private String dbpwd ="root";
	private String dbdriver ="com.mysql.cj.jdbc.Driver";
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection()
	{

		Connection con = null;
		try {
			con =DriverManager.getConnection(dburl,dbname,dbpwd);
		} catch (SQLException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public String insert(Employee employee)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result ="Data enter succesfully";
		String sql ="insert into empdatabase.users values(?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,employee.getEmployeeId());
			ps.setString(2,employee.getEmployeeName());
			ps.setString(3,employee.getEmployeeEmail());
			ps.setString(4,employee.getEmployeeLocation());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

}
