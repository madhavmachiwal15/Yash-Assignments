package com.yash.student;

public class Student
{
	String name;
	int age;
	String address;
	
	Student()
	{
		name = "Unknown";
		age = 0;
		address = "Not available";
	}
	
	void setInfo(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void setInfo(String name, int age, String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	void display()
	{
		System.out.println(name+" "+age+" "+address);
	}
}
