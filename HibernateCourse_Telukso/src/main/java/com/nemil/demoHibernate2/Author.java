package com.nemil.demoHibernate2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Author 
{
	
	@Id
	private int aId;
	private String aName;
	@ManyToOne
	private Book book;
	
	/*
	 * @Many
	 * ToMany private List<Book> books;
	 */
	
	
	
	
	/*
	 * public List<Book> getBooks() { return books; } public void
	 * setBooks(List<Book> books) { this.books = books; }
	 */
	public int getaId() {
		return aId;
	}
	
	
	  @Override public String toString() { return "Author [aId=" + aId + ", aName="
	  + aName + "]"; }
	 

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	

	

}
