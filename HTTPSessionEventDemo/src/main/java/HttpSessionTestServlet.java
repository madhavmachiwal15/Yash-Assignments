

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HttpSessionTestServlet
 */
@WebServlet("/HttpSessionTestServlet")
public class HttpSessionTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static Logger logger = Logger.getAnonymousLogger();
	public void init(ServletConfig config) throws ServletException
	{
		logger.info("***************Init Method is Called************"
				+ this.getClass().getName());
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		sleep();
		HttpSession httpSession = request.getSession();
		sleep();
		httpSession.invalidate();
	}

	private void sleep() 
	{
		try
		{
			Thread.sleep(20000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
