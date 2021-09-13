package com.yash.springspel.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springspel.model.SpelDemo;

public class MainApp {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		SpelDemo sd = appContext.getBean("demo", SpelDemo.class);
		
		System.out.println(sd);

	}

}
