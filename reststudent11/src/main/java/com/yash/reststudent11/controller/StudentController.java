package com.yash.reststudent11.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.reststudent11.model.Student;
import com.yash.reststudent11.serviceimpl.StudentServiceImpl;

@Path("/students")
public class StudentController 
{
	StudentServiceImpl simpl=new StudentServiceImpl();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List getStudents()
	{
		List listOfStudents=simpl.addStudent(st);
		return listOfStudents;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public List getAllStudents()
	{
		List listOfStudents=simpl.addStudent(st);
		return listOfStudents;
	}	
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public List deleteStudent()
	{
		return simpl.deleteStudent(student);
		
	}
}
