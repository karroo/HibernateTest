package com.mindwareworks.kbs.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	static{
		try{
			sessionFactory = new AnnotationConfiguration().configure("/conf/hibernate.cfg.xml").buildSessionFactory();
			
		}catch(Throwable ex){
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	public static void shutdown(){
		getSessionFactory().close();
	}
}

