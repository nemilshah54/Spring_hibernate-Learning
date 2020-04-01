package com.nemil.demoHibernate2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/*Mapping Relations:
OnetoMany
ManytoMany
OnetoOne

Use mappedBy property.*/

public class MappingRelation {
	public Author a1;
	public Book b1;

	public void createResources() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors = new ArrayList<Author>();

		// Create a Author.
		a1 = new Author();

		a1.setaId(3);
		a1.setaName("Jayeeeee");

		// Create Book.
		b1 = new Book();
		b1.setBookName("Ring3");
		b1.setBookTitle("Ring of Lords3");
		b1.setSerielNo(103);

		a1.setBook(b1);

		// b1.setAuthor(a1);
		// books.add(b1);
		authors.add(a1);

		// a1.setBooks(books);
		b1.setAuthor(authors);
		// b1.getAuthor().add(a1);

	}

	public void configuration() 
	{
		Configuration con = new Configuration().configure().addAnnotatedClass(Author.class)
				.addAnnotatedClass(Book.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		
		/*
		 * // Lazy Fetching | Eager Fetching.
		 * 
		 * Book b1 = session.get(Book.class, 103); Collection<Author> authors =
		 * b1.getAuthor();
		 * 
		 * for ( Author a: authors) { System.out.println( a); }
		 */

		// session.save(a1);
		// session.save(b1);
		tx.commit();

	}

}
