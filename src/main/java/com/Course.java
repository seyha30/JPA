package com;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	Long id;

	@ManyToMany
	Set<Student> likes;
}
