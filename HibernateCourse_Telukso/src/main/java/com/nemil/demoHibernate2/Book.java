package com.nemil.demoHibernate2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Book 
{
	@Id
	private int serielNo;
	private String bookName;
	private String bookTitle;
	
	@OneToMany ( mappedBy = "book", fetch = FetchType.EAGER)
	private List<Author> author = new ArrayList<Author>();
	
	
	@Override
	public String toString() {
		return "Book [serielNo=" + serielNo + ", bookName=" + bookName + ", bookTitle=" + bookTitle + ", author="
				+ author + "]";
	}
	public List<Author> getAuthor() {
		return author;
	}
	public void setAuthor(List<Author> author) {
		this.author = author;
	}
	public int getSerielNo() {
		return serielNo;
	}
	public void setSerielNo(int serielNo) {
		this.serielNo = serielNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	

}
