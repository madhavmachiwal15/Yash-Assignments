package com.yash.onetomany.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.yash.onetomany.model.Machine;
import com.yash.onetomany.model.Work;

public class MachineApp {

	public static void main(String[] args) {
		   StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml").build();  
		    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
		      
		    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		    Session session=factory.openSession();  
		      
		    Transaction t=session.beginTransaction(); 
		    
		    Work w1 = new Work();
		    w1.setId(1);
		    w1.setMade_by("Lenevo");
		    w1.setWork("Calculate");
		    
		    Work w2 = new Work();
		    w2.setId(2);
		    w2.setMade_by("Dell");
		    w2.setWork("Computation");
		    
		    ArrayList<Work> list1 = new ArrayList<Work>();
		    list1.add(w1);
		    list1.add(w2);

	//	    ArrayList<Work> list2 = new ArrayList<Work>();
	//	    list2.add(w1);
	//	    list2.add(w2);
		    
		    Machine m1 = new Machine();
		    m1.setId(1);
		    m1.setName("Calculator");
		    m1.setWork(list1);
		   
		    Machine m2 = new Machine();
		    m2.setId(2);
		    m2.setName("Computer");
	//	    m2.setWork(list2);
		    
		    session.persist(m1);
		    session.persist(m2);
   
		    t.commit();
		    session.close();

	}

}
