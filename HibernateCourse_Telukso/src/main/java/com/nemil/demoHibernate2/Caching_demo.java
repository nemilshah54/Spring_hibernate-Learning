package com.nemil.demoHibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.model.Caching;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Caching_demo 
{
	public static void Caching_level1()
	{
		Student s1 = null;
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);
		
		
		/*
		 * Hibernate by default provides first level Caching. Hence, same query from
		 * same session will be fire only once. Same query with different session will
		 * fire everytime. ( Use 2nd level caching.)
		 * 
		 * 2nd Level Caching: Set up confirguration. Query is fire once even using 2 different sessions.
		 */
		
		// Session1.
		Session session1 = sf.openSession();
		
		session1.beginTransaction();
		
		s1 = (Student) session1.get(Student.class, 1);
		
		System.out.println(s1);
		
		/*
		 * s1 = (Student) session1.get(Student.class, 1); System.out.println(s1);
		 */
			
		session1.getTransaction().commit();
		session1.close();
		
		
		// Session2.
		Session session2 = sf.openSession();	
		session2.beginTransaction();
		
		s1 = (Student) session2.get(Student.class, 1);
		
		System.out.println(s1);
		session2.getTransaction().commit();	
		
		session2.close();
			
	}

}
