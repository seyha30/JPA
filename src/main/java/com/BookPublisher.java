package com;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class BookPublisher {
	@Id
	@GeneratedValue
	private long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "book_id")
	private Book book;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "publisher_id")
	private Publisher publisher;

	private Date publishedDate;

	public BookPublisher(Publisher publisher, Date publishedDate) {
		this.publisher = publisher;
		this.publishedDate = publishedDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof BookPublisher))
			return false;
		BookPublisher that = (BookPublisher) o;
		return Objects.equals(book.getName(), that.book.getName())
				&& Objects.equals(publisher.getName(), that.publisher.getName())
				&& Objects.equals(publishedDate, that.publishedDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(book.getName(), publisher.getName(), publishedDate);
	}
   

}
