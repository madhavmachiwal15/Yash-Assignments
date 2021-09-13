package com.yash.fetching.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.yash.fetching.model.Address;
import com.yash.fetching.model.User;
/**
 * Main app implementing hibernate
 * @author madhav.machiwal
 *
 */
public class App {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	    
	    Transaction t=session.beginTransaction(); 
	    
	    User user = new User();
	    user.setId(3);
	    user.setName("Abhishek");
	    
	    Address address = new Address();
	    address.setCity("Pune");
	    address.setState("Maharashtra");
	    address.setPincode("123456");
	    
	    user.getListofaddress().add(address);
	    
	    session.save(user);
	    
	    t.commit();
	    session.close();
	    
	    session = factory.openSession(); 
	    user = null;
	    user = (User) session.get(User.class, 1); 
	    System.out.println(user.getListofaddress().size());

	}

}
