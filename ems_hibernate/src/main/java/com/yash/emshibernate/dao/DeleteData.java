package com.yash.emshibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.yash.emshibernate.model.Employee;

public class DeleteData 
{
	public void delete()
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		Session session=factory.openSession();  

		Transaction t=session.beginTransaction();
		Employee emp = new Employee();
		emp.setId(2);

		session.delete(emp);
	
		t.commit();

		session.close();
	}
}
