

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class CountFilter
 */
@WebServlet("/CountFilter")
public class CountFilter implements Filter {

	
	static int count = 0;
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		chain.doFilter(request, response);
		
		out.println("Total Count: "+(++count));
		out.close();
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	
	
}
