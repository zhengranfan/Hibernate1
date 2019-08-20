package com.fan.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	static {
		
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			throw new ExceptionInInitializerError("初始化SessionFactory失败，请检查配置文件");
		}
		
	}
	
	public static Session openSession() {
		return sessionFactory.openSession();
		
	}
	
}
