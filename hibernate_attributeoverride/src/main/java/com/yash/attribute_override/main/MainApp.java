package com.yash.attribute_override.main;    

import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.yash.attribute_override.model.Employee;
import com.yash.attribute_override.model.EmployeeAddress;   
/**
 * Main app for storing data 
 * @author madhav.machiwal
 *
 */
public class MainApp {    
	public static void main(String[] args) {    

		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml").build();  
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  

		SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		Session session=factory.openSession();  

		Transaction t=session.beginTransaction(); 
		
		Employee emp = new Employee();
		EmployeeAddress add = new EmployeeAddress();
		
		add.setState("MP");
		add.setCity("Indore");
		add.setPincode("452009");
		
		emp.setId(1);
		emp.setName("Madhav");
		emp.setAddress(add);
		
		session.save(emp);
		t.commit();
		session.close();
	}
}