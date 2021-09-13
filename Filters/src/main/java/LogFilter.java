

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/LogFilter")
public class LogFilter implements Filter {

	static Logger logger = Logger.getAnonymousLogger();
	
	@Override
	public void init(FilterConfig fConfig) throws ServletException {

		logger.info("*****************Init Method: "
				+ this.getClass().getName());
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException
	{
		HttpServletRequest req = (HttpServletRequest)request;
		
		String rad = req.getRemoteAddr();
		String rh = req.getRemoteHost();
		
		logger.info("<br>Remote address: "+rad+"<br>Remote Host: "+rh);
	
		chain.doFilter(request, response);	
	
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		logger.info("*****************Destroy Method: "+ this.getClass().getName());
	}

}
