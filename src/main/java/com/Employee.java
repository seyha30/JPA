package com;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	@Enumerated(EnumType.STRING)// if don't set enumType by default it take from 0-1-2-3
	@Column(length = 10)
	private EmployeeType employeeType;
	@Temporal(TemporalType.DATE)
	private Calendar dob;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "s_date")
	private Calendar startDate;

}
