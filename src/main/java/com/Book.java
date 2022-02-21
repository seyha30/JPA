package com;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name")
	private String name;
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private Set<BookPublisher> bookPublishers;

	public Book(String name, BookPublisher...bookPublishers){
		this.name = name;
		for (BookPublisher bookPublisher : bookPublishers)
			bookPublisher.setBook(this);
		this.bookPublishers = Stream.of(bookPublishers).collect(Collectors.toSet());
	}

}
