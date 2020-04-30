package com.tek.hibernate.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "employer_master", uniqueConstraints = { @UniqueConstraint(columnNames = "EMPLOYER_NM") })
public class Employer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYER_ID")
	private Long employerId;
	@Column(name = "EMPLOYER_NM", length = 50)
	private String employerName;
	@Column(name = "EMPLOYER_ADDRESS", length = 150)
	private String employerAddress;

	// Since many to one are (almost) always the owner side of a bidirectional
	// relationship in the JPA spec, the one to many association is annotated by
	// @OneToMany(mappedBy=...)

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employer")
	private Set<Employee> employees = new HashSet<Employee>();

	public Long getEmployerId() {
		return employerId;
	}

	public void setEmployerId(Long employerId) {
		this.employerId = employerId;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmployerAddress() {
		return employerAddress;
	}

	public void setEmployerAddress(String employerAddress) {
		this.employerAddress = employerAddress;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
