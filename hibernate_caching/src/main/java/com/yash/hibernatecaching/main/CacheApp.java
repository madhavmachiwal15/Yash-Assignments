package com.yash.hibernatecaching.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.yash.hibernatecaching.model.Employee;
/**
 * showing concept of second level caching 
 * Hibernate supports first level caching by default
 * @author madhav.machiwal
 *
 */
public class CacheApp 
{
	public static void main(String[] args)
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		Session session1=factory.openSession();  

		Transaction t=session1.beginTransaction();

		Employee emp = new Employee();
		//emp.setId(1);
		//	emp.setName("Madhav");
		//	emp.setDesignation("Trainee Programmer");
		//	emp.setSalary(25000.00);

		//	emp.setName("Dharmesh");
		//	emp.setDesignation("IT Service Provider");
		//	emp.setSalary(22000.00);

		Employee a = session1.get(Employee.class, 1l);
		System.out.println(a.toString());
		
	//	session1.save(emp);
		
		session1.getTransaction().commit();
		session1.close();
		
		Session session2 = factory.openSession();
		session2.beginTransaction();
		a = session2.get(Employee.class, 1l);
		System.out.println(a.toString());
		
		session2.getTransaction().commit();
		session2.close();
		
	}
}
