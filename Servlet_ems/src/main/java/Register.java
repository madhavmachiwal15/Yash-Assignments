

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =  request.getParameter("id");  
	    String name =  request.getParameter("name");   
		String empmail = request.getParameter("empmail");
		String location = request.getParameter("location");
		Employee employee = new Employee(id, name, empmail, location);
		RegisterDao rdao = new RegisterDao();
		String result =rdao.insert(employee);
		response.getWriter().println(result);
		doGet(request, response);
		
	}

}
