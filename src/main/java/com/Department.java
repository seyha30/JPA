package com;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private long id;
	@Column
	private String name;
	@OneToMany(mappedBy = "department")
	private Collection <Employee> employees;
	
}
