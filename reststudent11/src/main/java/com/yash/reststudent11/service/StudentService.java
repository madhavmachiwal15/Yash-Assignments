package com.yash.reststudent11.service;

import java.util.List;

import com.yash.reststudent11.model.Student;

public interface StudentService 
{
	public List<Student> getAllStudents();
	public List<Student> updateStudent(Student student);
	public List<Student> deleteStudent(Student student);
	public List<Student> addStudent(Student st);
}
