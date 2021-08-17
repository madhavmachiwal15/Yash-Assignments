package com.yash.student;

public class StudentApp 
{

	public static void main(String[] args)
	{
		Student[] obj = new Student[10];
		
		for(int i=0; i<10; i++)
		{
			obj[i] = new Student(); 
		}

		obj[0].setInfo("ABC", 21, "Indore");
		obj[1].setInfo("XYZ", 25, "Ujjain");
		obj[2].setInfo("Madhav", 21, "Indore");
		obj[3].setInfo("Vipin", 23, "Pune");
		obj[4].setInfo("Harsh", 22, "Khandwa");
		obj[5].setInfo("Ayush", 24, "Gwalior");
		obj[6].setInfo("PQR", 20, "Mumbai");
		obj[7].setInfo("STD", 25, "Pune");
		obj[8].setInfo("Atul", 25, "Mumbai");
		obj[9].setInfo("Aman", 26, "Chennai");
		
		for(int i=0; i<10; i++)
		{
			obj[i].display(); 
		}
	}

}
