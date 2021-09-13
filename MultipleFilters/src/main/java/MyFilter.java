

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class MyFilter
 */
@WebServlet("/MyFilter")
public class MyFilter implements Filter {


	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		PrintWriter out = response.getWriter();

		String remoteAddr = request.getRemoteAddr();
		
		out.println("<br>Remote Address: "+remoteAddr);

		chain.doFilter(request, response);
	}

	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}



}
