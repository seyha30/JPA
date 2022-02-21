package com;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Embeddable
@Access(AccessType.FIELD)
public class RecordTracker implements Serializable {

	private static final long serialVersionUID = -8949873893610843569L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = true, updatable = false)
	@CreationTimestamp
	private Date createdDate;

	@Column
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = true, updatable = true)
	@UpdateTimestamp
	private Date modifiedDate;

	@Column
	private String modifiedBy;

}
