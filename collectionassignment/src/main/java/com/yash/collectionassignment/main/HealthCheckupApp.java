package com.yash.collectionassignment.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.yash.collectionassignment.pojo.Patient;
import com.yash.collectionassignment.pojo.Product;

/**
 * Main App to perform various operations
 * @author madhav.machiwal
 *
 */
public class HealthCheckupApp 
{
	public static void main(String[] args) 
	{
		HashSet<Patient> set = new HashSet<>();
		Patient p1 = new Patient(1001, "Madhav", 21);
		Patient p2 = new Patient(1005, "Dharmesh", 23);
		Patient p3 = new Patient(2051, "Atul", 21);
		Patient p4 = new Patient(1000, "Arjun", 23);
		Patient p5 = new Patient(4061, "Aman", 25);
		Patient p6 = new Patient(709, "Uday", 19); 
		Patient p7 = new Patient(1509, "Tarun", 25); 
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		set.add(p7);
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
		
		ArrayList<Patient> list = new ArrayList<Patient>(set);
		System.out.println("Details of First Patient: ");
		System.out.println(list.get(0));
		
		System.out.println("Details of Last Patient: ");
		System.out.println(list.get(list.size()-1));
		
		System.out.println("First Five Patients Details: ");
		System.out.println(list.subList(0, 4));
		
		
	}

}
