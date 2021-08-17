package com.yash.jdk8features.streamapiandtimeapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exmaple of stream api using different types of methods
 * @author madhav.machiwal
 *
 */
public class StudentApp {

	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1001, "Madhav", "Science", 350));
		list.add(new Student(2002, "Atul", "Arts", 110));
		list.add(new Student(1003, "Arjun", "Science", 340));
		list.add(new Student(3004, "Aman", "Commerce", 160));
		list.add(new Student(4005, "Mayank", "Biology", 480));

		// name of students who have less than 200 marks
		ArrayList<String> names = (ArrayList<String>) list.stream()
				.filter(student -> student.totalMarks <= 200)
				.map(student -> student.studentName)
				.collect(Collectors.toList());
		System.out.println(names);

		// name of the student who got maximum marks
		Student s1 = list.stream()
				.max((student1, student2) -> student1.totalMarks > student2.totalMarks ? 1: -1).get();
		System.out.println(s1.studentName+" "+s1.totalMarks);

		// name of the student who got minimum marks
		Student s2 = list.stream()
				.min((student1, student2) -> student1.totalMarks > student2.totalMarks ? 1: -1).get();
		System.out.println(s2.studentName+" "+s2.totalMarks);

		// get the all student id
		ArrayList<Long> id = (ArrayList<Long>) list.stream()
				.map(student -> student.studentRollNumber)
				.collect(Collectors.toList());
		System.out.println(id);

		// count method
		long count = list.stream()
				.map(s -> s.studentRollNumber)
				//	.mapToLong(s -> 1L).sum();
				.count();
		System.out.println("Total Student: "+count);

		// allMatch method only returns true when record is empty or match with predicate 
		boolean b = list.stream()
				.allMatch(s -> s.studentName == "Aman" );
		System.out.println(b);

		// anyMatch return true when any record match with predicate
		boolean check = list.stream()
				.anyMatch(s -> s.studentName == "Madhav");
		System.out.println(check);

		//sum of total marks
		Long sumOfTotalMarks = list.stream()
				.map(s -> s.totalMarks)
				.reduce(0L,(sumTotalMarks, totalMarks)->sumTotalMarks+totalMarks);
		System.out.println(sumOfTotalMarks);

		List<String> str = list.stream()
				.map(s -> s.subject)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(str);	
		
		List<Student> p = (List<Student>) list.stream()
				.peek(System.out::println)
				.collect(Collectors.toList());
	
		
		



	}

}
