package com.nemil.demoHibernate2;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.Map;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Hql_demo 
{
	public static void Hql()
	{
		Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
	

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		// HQL Queries
	    // Table Name ---> Class Name.   Column Name --> Class Field Name.  ( SQL-->HQL). 
		
//		// Test1 - Result set.
//		Query q1 = session.createQuery("from Customer where customerBought > 70");
//		List<Customer> customers = q1.list();	
//		for ( Customer c: customers)
//		{
//			System.out.println(c);
//		}
		
//		// Test 2 Unique Result.
//		
//		Query q1 = session.createQuery("from Customer where customerId = 5");
//		Customer c1 = (Customer) q1.uniqueResult();
//		System.out.println(c1);
		
		// Test 3 Select statements.
		// Note: Customer object will be returned if we dont use select statment.
		// If select statement is used, then it is returned in Object. Object is array of different data types.
		
//		Query q1 = session.createQuery("select customerName, customerBought from Customer c where c.customerBought > 60");
//		
//		List<Object[]> customers = q1.list();
//		
//		for(Object[]  customer: customers)
//		{
//			System.out.println(customer[0] + " " + customer[1]);
//		}
		
//		int x = 60;
//		Query q1 = session.createQuery("select sum(customerBought) from Customer c where c.customerBought > :x");
//		q1.setParameter("x", x);
//		
//		Long totalSale = (Long) q1.uniqueResult();
//		
//		System.out.println( "Total Sale: " + totalSale);
		
	
		
		// SQL Queries. ( Native Queries).
		
		// Test 1
//		SQLQuery sqlQuery = session.createSQLQuery("select * from Customer");
//		sqlQuery.addEntity(Customer.class);   // By default, Objects are fetched. Converting Objects --> Customer
//		
//		List<Customer> customers = sqlQuery.list();
//		
//		for ( Customer c1: customers)
//		{
//			System.out.println(c1);
//		}
		
		// Test 2
		SQLQuery sqlQuery = session.createSQLQuery("select customerName, customerBought from Customer where customerBought > 90");
		
//		List<Object[]> customers = sqlQuery.list();	
//		for ( Object[] c1: customers)
//		{
//			System.out.println( c1[0] + " " + c1[1] );
//		}
		
		// OR	
		sqlQuery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		List<Object> customers = sqlQuery.list();	
		
		for ( Object c1: customers)
		{
			Map c =(Map)c1;
			System.out.println(c.get("customerName") + ": " + c.get("customerBought"));
		}

		session.getTransaction().commit();	
	}

}
