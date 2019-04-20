package com.sciencom.firstApplication.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String isbn; 
	private String title;
	private String publisher;
	//@ManyToMany(mappedBy = "books")
	@ManyToMany(targetEntity = Author.class)
	private Set<Author> authors =new HashSet<>();
	
	public Book(String isbn, String title, String publisher) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
	}
	public Book(String isbn, String title, String publisher, Set<Author> authors) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
		this.authors = authors;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	
	
	
}
