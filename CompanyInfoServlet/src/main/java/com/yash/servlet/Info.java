package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Info
 */
@WebServlet("/Info")
public class Info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Info() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig servletConfig = getServletConfig();
		String name = servletConfig.getInitParameter("companyName");
		String email = servletConfig.getInitParameter("email");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Company Name: "+name+" </h2><br>");
		out.println("<h2>Company Email: "+email+" </h2><br>");
		
	}

}
