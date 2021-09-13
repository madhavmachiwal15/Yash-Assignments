package com.yash.hibernateinheritance.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.yash.hibernateinheritance.model.Maths;
import com.yash.hibernateinheritance.model.Science;
import com.yash.hibernateinheritance.model.Subject;
/**
 * implementing application which show concepts of hibernate
 * @author madhav.machiwal
 *
 */
public class SubjectApp {

	public static void main(String[] args) 
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		Session session=factory.openSession();  

		Transaction t=session.beginTransaction();
		
		Subject sub = new Subject();
	//	sub.setId(1);
		sub.setType("Academic");

		Maths m = new Maths();
		m.setName("Mathematics");
		m.setType("Academic Adv");
		m.setMarks(79);
	
		Science s = new Science();
		s.setName("Science");
		s.setType("Academic Advanced");
		s.setMarks(87);
		
		session.save(sub);
		session.save(m);
		session.save(s);
		
		t.commit();
		
		session.close();
	}

}
