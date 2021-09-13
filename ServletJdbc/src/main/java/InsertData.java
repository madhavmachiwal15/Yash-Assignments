

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertData
 */
@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try 
		{
			Connection con = DataBaseConnection.initializeDatabase();
			PreparedStatement pst = con.prepareStatement("insert into example values(?,?)");
			pst.setInt(1, Integer.valueOf(request.getParameter("id")));
			pst.setString(1, request.getParameter("name"));
			pst.executeUpdate();
			pst.close();
			con.close();
			
			PrintWriter out = response.getWriter();
			out.println("<html><body><b>Successfully Inserted"
                     + "</b></body></html>");
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			
			e.printStackTrace();
		}
	}

}
