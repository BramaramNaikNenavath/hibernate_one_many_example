package com.tek.hibernate.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ACCOUNT_C1", uniqueConstraints = { @UniqueConstraint(columnNames = "ID"),
		@UniqueConstraint(columnNames = "ACCOUNT_NUMBER") })
public class AccountC1 {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accId;

	@Column(name = "ACCOUNT_NUMBER", unique = true, nullable = false)
	private String accNo;

	@Column(name = "ACCOUNT_NAME")
	private String accName;

	@ManyToOne
	private EmployeeC1 employee;

	public Integer getAccId() {
		return accId;
	}

	public void setAccId(Integer accId) {
		this.accId = accId;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public EmployeeC1 getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeC1 employee) {
		this.employee = employee;
	}

}
