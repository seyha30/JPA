package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private String code;
	private String engName;
	private String khName;
	private String referentCode;
	private String keyCode;

}
