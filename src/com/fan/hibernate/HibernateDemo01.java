package com.fan.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.fan.domain.Customer;


public class HibernateDemo01 {

	/**
	 *  步骤分析：
	 *  
	 *  1。解析主配置文件
	 *  2.根据配置文件创建SeesionFactory对象
	 *  3.根据SessionFactory创建Session
	 *  4.开启事物
	 *  5.执行操作（保存）
	 *  6。提价事物
	 *  7.释放资源
	 */
	
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
	
	@Test
	public void Test02() {
		
	}
}
