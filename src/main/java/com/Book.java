package com;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToMany
	@JoinTable(name = "book_publisher", joinColumns = { @JoinColumn(name = "book_id") }, inverseJoinColumns = {
			@JoinColumn(name = "author_id") })
	private Set<Publisher> publishers = new HashSet<Publisher>();
	@Embedded
	private Addresses addresses;
}
