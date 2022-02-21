package com;

import java.util.Calendar;
import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	@Enumerated(EnumType.STRING) // if don't set enumType by default it take from 0-1-2-3
	@Column(length = 10)
	private EmployeeType employeeType;
	@Temporal(TemporalType.DATE)
	private Calendar dob; // option 1 for set date type
	@Temporal(TemporalType.DATE)
	@Column(name = "s_date")
	private java.util.Date startDate; // option 2 for set date type
	private long salary;
	transient private String translateName;
	@OneToOne(fetch = FetchType.LAZY)
	private ParkingSpace parkingSpace;
	
	@ManyToMany
	private Collection<Project> projects;

//	private String state;
//	private String street;
//	private String city;
//	private String zipCode;

	@Embedded
	// try this if you want to override column name of @Embeddable class's fields
	@AttributeOverrides({ @AttributeOverride(name = "state", column = @Column(name = "province")),
			@AttributeOverride(name = "zip", column = @Column(name = "POSTAL_CODE")) })
	private Addresses addresses;

}
