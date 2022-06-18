package com;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	String firstName;
	String lastName;
	@ManyToMany
	private Set<Person> parents = new HashSet<>();
	
	@ManyToMany(mappedBy = "parents")
	private Set<Person> child = new HashSet<>();
}

