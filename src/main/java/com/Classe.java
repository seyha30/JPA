package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classe {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
}
