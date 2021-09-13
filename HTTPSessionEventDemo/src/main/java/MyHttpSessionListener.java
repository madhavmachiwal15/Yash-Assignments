import java.util.logging.Logger;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener
{

	static Logger logger = Logger.getAnonymousLogger();
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		logger.info("********************");

		logger.info("sessionCreated method has been called in "
				+this.getClass().getName());

		HttpSession session = se.getSession();
		logger.info(session +" created!!");

		logger.info("ID: "+session.getId()+
				"MaxInactiveInterval: "+session.getMaxInactiveInterval());
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		logger.info("*********************");

		logger.info("sessionDestroyed method has been called in "
				+this.getClass().getName());

		HttpSession session = se.getSession();
		logger.info(session +" destroyed!!");

		logger.info("ID: "+session.getId()+
				"MaxInactiveInterval: "+session.getMaxInactiveInterval());
		
	}

}
