package com.yash.springcallback.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springcallback.model.Traingle;

public class MainApp {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Traingle tri = (Traingle) appContext.getBean("Traingle");
		tri.draw();
	}

}
