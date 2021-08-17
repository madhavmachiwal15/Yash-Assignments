package com.yash.collectionassignment.main;

import java.util.Stack;
import java.util.Vector;

import com.yash.collectionassignment.pojo.Student;

public class StudentApp 
{

	public static void main(String[] args)
	{
		Vector<Student> v = new Vector<>();
		Student s1 = new Student(101, "Madhav", "12th");
		Student s2 = new Student(102, "Atul", "10th");
		Student s3 = new Student(131, "Arjun", "9th");
		Student s4 = new Student(301, "Dharmesh", "7th");
		Student s5 = new Student(401, "Aman", "11th");
		
		
		v.addElement(s1);
		v.addElement(s2);
		v.addElement(s3);
		v.addElement(s4);
		v.addElement(s5);
		
		for(Student s : v)
		{
			System.out.println(s);
		}
		
		System.out.println("Capacity: "+v.capacity());
		System.out.println("Size: "+v.size());
		System.out.println(v.contains(s2));
		System.out.println("Second record: "+v.get(1));
		
		
		Stack<Student> st = new Stack<>();
		st.push(s1);
		st.pop();
		st.push(s2);
		st.push(s3);
		st.push(s4);
		st.push(s5);
		
		for(Student s : st)
		{
			System.out.println(s);
		}
		
		System.out.println(st.capacity());
		System.out.println(st.isEmpty());
	}

}
