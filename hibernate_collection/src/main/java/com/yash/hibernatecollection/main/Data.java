package com.yash.hibernatecollection.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import com.yash.hibernatecollection.model.Employee;
import com.yash.hibernatecollection.model.Location;

/**
 * Main app to store data
 * @author madhav.machiwal
 *
 */
public class Data 
{
	public static void main(String args[])
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	    
	    Transaction t=session.beginTransaction(); 
	    
	    Employee e1 = new Employee();
	    e1.setId(1);
	    e1.setName("Madhav Machiwal");
	    
	    Location lc = new Location();
	    lc.setCity("Indore");
	    lc.setState("MP");
	    lc.setPincode("452009");
	    
	    e1.getLoc().add(lc);
	    
	    session.save(e1);
	    
	    t.commit();
	    
	    System.out.println("Success!!");
	    session.close();
	}
}
