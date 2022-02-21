package com;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.FIELD)
public class Addresses {
	private String street;
	private String city;
	private String state;
	@Column(name = "ZIP_CODE")
	private String zip;
}
