package com;

import java.text.Format;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class BookPublisher {

	@EmbeddedId
    private BookPublisherId id = new BookPublisherId();
 
    @ManyToOne
    @MapsId("bookId")
    private Book book;
 
    @ManyToOne
    @MapsId("publisherId")
    private Publisher publisher;
 
    private Format format;	
	
}
