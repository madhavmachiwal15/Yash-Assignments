

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/One")
public class One extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("Servlet One: Start----------");
		ServletConfig config = getServletConfig();
		out.println("Value of p1- "+config.getInitParameter("p1")+"<br>");
		out.println("Value of p2- "+config.getInitParameter("p2")+"<br>");
		out.println("Value of p3- "+config.getInitParameter("p3")+"<br>");
		out.println("Value of p4- "+config.getInitParameter("p4")+"<br>");
		
		ServletContext application = getServletContext();
		out.println("Value of p5: "+application.getInitParameter("p5")+"<br>");
		out.println("Servlet One: End------------");
	}

}
