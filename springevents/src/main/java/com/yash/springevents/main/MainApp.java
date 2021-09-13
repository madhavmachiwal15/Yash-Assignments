package com.yash.springevents.main;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springevents.model.Message;

/**
 * Main application showing the concepts of 3 events using methods start(), stop() and close() 
 * @author madhav.machiwal
 *
 */
public class MainApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ConfigurableApplicationContext appContext = new 
				ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		/**
		 * start method is called
		 */
		appContext.start();
		
		Message m = (Message) appContext.getBean("message"); 
		System.out.println("Message: "+m.getMsg());
		
		/**
		 * stop method is called
		 */
		appContext.stop();
		
	//	appContext.start();
		
		/**
		 * after calling of close method neither start method is called nor stop method..
		 */
		appContext.close();
		
		/**
		 * appContext.start() will not work after close() method
		 */
	//	appContext.start();
	}

}
