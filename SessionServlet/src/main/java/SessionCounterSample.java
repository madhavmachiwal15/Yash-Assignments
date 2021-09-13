

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionCounterSample")
public class SessionCounterSample extends HttpServlet {
	
	private static final long serialVersionUID = 1L;  
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Step 1: get the session object
		
		boolean create = true;
		HttpSession session = request.getSession(create);
		
		//Step 2: get the session data
		Integer counter = (Integer) session.getAttribute("myCounter");
		
		if(counter==null) {
			counter=1;
		}
		else {
			counter++;
		}
		
		session.setAttribute("myCounter", counter);
		
		//Step 3: output of the page
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Session Tracking Demo</title></head>");
		out.println("<body>");
		out.println("<h1>Session Tracking Counter Sample App</h1>");
		out.println("You have hit this page: "+counter+" times");
		out.println("Your Session Cookie: "+request.getHeader("Cookie"));
		out.println("<br> Your Session ID: "+session.getId());
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
