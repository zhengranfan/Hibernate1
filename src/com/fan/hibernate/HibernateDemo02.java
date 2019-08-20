package com.fan.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.fan.domain.Customer;

public class HibernateDemo02 {
	
	
	@Test
	public void Test1() {
		
		Customer customer = new Customer();
		customer.setCustAge(25);
		customer.setCustName("tom2");
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction rTransaction = session.beginTransaction();
		session.save(customer);
		rTransaction.commit();
		session.close();
		sessionFactory.close();
	}

}
