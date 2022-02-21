package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ParkingSpace {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String location;
	private int lot;
	@OneToOne( mappedBy = "parkingSpace")
	private Employee employee;
	
	

}
