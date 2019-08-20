package com.fan.hibernate;



import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.fan.domain.Customer;
import com.fan.utils.HibernateUtil;

public class HIbernateDemo03 {

	
	@Test
	public void TestSave() {
		Customer customer =new Customer();
		customer.setCustAge(33);
		customer.setCustName("henry");
		Session session = HibernateUtil.openSession();
		Transaction rTransaction =session.beginTransaction();
		session.save(customer);
		rTransaction.commit();
		session.close();
		
	}
	
	@Test
	public void testFindOne() {
		Session session = HibernateUtil.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer =session.get(Customer.class, 1L);
		transaction.commit();
		session.close();
		System.out.print(customer);
	}
	
	@Test
	public void testUpdate() {
		Session session = HibernateUtil.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer= session.get(Customer.class, 1L);
		customer.setCustAge(88);
		session.update(customer);
		transaction.commit();
		session.close();
	}
	
	//@Test
	public void testDelete() {
		Session session = HibernateUtil.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer= session.get(Customer.class, 2L);
		session.delete(customer);
		transaction.commit();
		session.close();
		
	}
	
	@Test
	public void testFindAll() {
		Session session = HibernateUtil.openSession();
		Transaction transaction = session.beginTransaction();
		SQLQuery sqlQuery = session.createSQLQuery("select * from cst_customer");
		List<Object[]> list = sqlQuery.list();
		for(Object[] objects : list) {
			for(Object object2 : objects ) {
				
				System.out.println(object2);
				
			}
			
		}
		
		transaction.commit();
		session.close();
		
	}
	

}

