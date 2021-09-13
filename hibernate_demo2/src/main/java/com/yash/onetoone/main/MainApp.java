package com.yash.onetoone.main;    

import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.yash.onetoone.model.Student;
import com.yash.onetoone.model.Subject;    
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

		Student s1=new Student();    
		s1.setId(1);
		s1.setName("Madhav Machiwal");    

		Subject sub1=new Subject();    
		sub1.setSubId(101); 
		sub1.setSubName("Maths");
   
		sub1.setStudent(s1);
		session.save(s1);
		t.commit();    

		session.close();    
		System.out.println("success!!");    
	}    
}    