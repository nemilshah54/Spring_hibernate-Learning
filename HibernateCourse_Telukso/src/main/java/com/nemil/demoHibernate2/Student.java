package com.nemil.demoHibernate2;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;

import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="UIC_Student")   // Custom table name.
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)

public class Student 
{
	@Id
	int id;
	
	//@Transient    -- Disallow that field to show in database.
	StudentName name;
	
    @Column(name="Programming_Langugage")   // Custom column name.
	String lang;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public StudentName getName() {
		return name;
	}
	public void setName(StudentName name) {
		this.name = name;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lang=" + lang + "]";
	}
	
}
