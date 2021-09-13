

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletExample
 */
@WebServlet("/ServletExample")
public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public int add()
	{
		final int a=5;
		final int b=3;
		return a+b;
	}
	
/*	public int table()
	{
		int num = 3, v = 0;
		for(int i=1; i<=num; i++)
				v=num*i;
		return v;
	}	*/
	
	
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<br> Addition is: "+add());
	//	out.println("<br> Table of 3 is :"+table());
		
		
		out.println("<br> Fibonacci series is: ");
		int num1 = 0, num2 = 1, num3,i, count = 10;
		out.println(num1+" "+num2);
		
		 for(i=2;i<count;++i)
		 {    
		  num3=num1+num2;    
		  out.print(" "+num3);    
		  num1=num2;    
		  num2=num3;    
		 }
		 
	}

}
