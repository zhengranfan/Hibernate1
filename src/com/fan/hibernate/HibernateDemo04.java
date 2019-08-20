package com.fan.hibernate;

import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.junit.Test;

import com.fan.utils.HibernateUtil;

public class HibernateDemo04 {

	
	@Test
	public void Test1() {
		Session session = HibernateUtil.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.doWork(new Work() {
			
			@Override
			public void execute(Connection arg0) throws SQLException {
				System.out.print(arg0);
				
			}
		});
		
		
		transaction.commit();
		session.close();
	}
	
}
