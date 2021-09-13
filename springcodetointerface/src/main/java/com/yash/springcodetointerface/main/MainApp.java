package com.yash.springcodetointerface.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springcodetointerface.model.Line;
import com.yash.springcodetointerface.service.Shape;

/**
 * Mai application to show the concept of coding to interface
 * @author madhav.machiwal
 *
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Shape shape = appContext.getBean("Line", Line.class);
		shape.draw();
	}

}
