package com.yash.springfirstdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yash.springfirstdemo.model.Student;

@Configuration
public class ApplicationConfiguration 
{
	@Bean(name="studentObject")
	public Student getStudent()
	{
		return new Student(101, "Madhav", "Final Year");
	}

}
