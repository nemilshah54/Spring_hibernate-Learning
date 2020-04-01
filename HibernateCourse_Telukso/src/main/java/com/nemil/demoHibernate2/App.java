package com.nemil.demoHibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Hello world!
 *
 */

// App tester class.
public class App 
{
    public static void main( String[] args )
    {
		/*
		 * StudentName name = new StudentName(); name.setFirstName("Nemil");
		 * name.setLastName("Shah"); name.setMiddleName("Rajivkumar");
		 * 
		 * Student s1 = new Student(); s1.setId(1); s1.setName(name);
		 * s1.setLang("Java");
		 * 
		 * 
		 * // Student s1;
		 * 
		 * Configuration con = new
		 * Configuration().configure().addAnnotatedClass(Student.class);
		 * 
		 * ServiceRegistry reg = new
		 * StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		 * 
		 * SessionFactory sf = con.buildSessionFactory(reg); Session session =
		 * sf.openSession(); Transaction tx = session.beginTransaction();
		 * 
		 * session.save(s1); //Create an object-->Database.
		 * 
		 * // s1 = (Student) session.get(Student.class, 106); // Fetch object from
		 * database. tx.commit();
		 * 
		 * 
		 * System.out.println(s1);
		 */
    	
    	Hql_demo.Hql();
		/*
		 * MappingRelation r1 = new MappingRelation(); // r1.createResources(); //
		 * r1.configuration();
		 * 
		 * Caching_demo.Caching_level1();
		 */
        
    }
}
