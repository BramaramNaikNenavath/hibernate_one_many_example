package com.tek.hibernate.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee_master")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID")
	private Long employeeId;
	@Column(name = "FIRST_NM", length = 50)
	private String firstName;
	@Column(name = "LAST_NM", length = 50)
	private String lastName;

	// Since many to one are (almost) always the owner side of a bidirectional
	// relationship in the JPA spec, the one to many association is annotated by
	// @OneToMany(mappedBy=...)

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "EMPLOYER_ID", nullable = false)
	private Employer employer;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

}
