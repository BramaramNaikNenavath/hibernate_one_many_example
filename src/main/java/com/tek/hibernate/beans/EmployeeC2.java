package com.tek.hibernate.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Employee_C2", uniqueConstraints = { @UniqueConstraint(columnNames = "ID"),
		@UniqueConstraint(columnNames = "EMPLOYEE_EMAIL") })
public class EmployeeC2 {

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;

	@Column(name = "EMPLOYEE_EMAIL")
	private String email;

	@Column(name = "EMPLOYEE_NAME")
	private String name;

	@Column(name = "EMPLOYEE_DESIG")
	private String desig;

	@Column(name = "EMPLOYEE_SAL")
	private Double salary;

	@OneToMany(cascade = CascadeType.ALL)
	// @JoinColumn(name = "EMPLOYEE_ID")
	@JoinTable(name = "EMPLOYEE_ACCOUNT", joinColumns = {
			@JoinColumn(referencedColumnName = "ID") }, inverseJoinColumns = {
					@JoinColumn(referencedColumnName = "ID") })
	private Set<AccountC2> accounts;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Set<AccountC2> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<AccountC2> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Employee >>>>>> Id= " + employeeId + ", Name = " + name + ", Email = " + email + ", Salary = " + salary
				+ ", Designation = " + desig + " \n --------------------------------";
	}

}
