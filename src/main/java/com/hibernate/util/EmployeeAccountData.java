package com.hibernate.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.tek.hibernate.beans.AccountC1;
import com.tek.hibernate.beans.AccountC2;
import com.tek.hibernate.beans.EmployeeC1;
import com.tek.hibernate.beans.EmployeeC2;

public class EmployeeAccountData {

	private static Logger log = Logger.getLogger(EmployeeAccountData.class);

	private static List<EmployeeC1> generateOneToManyData() {
		EmployeeC1 emp1 = new EmployeeC1();
		emp1.setName("Bramaram Naik");
		emp1.setDesig("Module Lead");
		emp1.setEmail("Bramaram@gmail.com");
		emp1.setSalary(Double.valueOf(100000));

		EmployeeC1 emp2 = new EmployeeC1();
		emp2.setName("Naveen B");
		emp2.setDesig("Senior Techinal Lead");
		emp2.setEmail("Naveen@gmail.com");
		emp2.setSalary(Double.valueOf(130000));

		EmployeeC1 emp3 = new EmployeeC1();
		emp3.setName("Abhishek G");
		emp3.setDesig("CEO");
		emp3.setEmail("Abhishek@gmail.com");
		emp3.setSalary(Double.valueOf(80000));

		AccountC1 acc1 = new AccountC1();
		acc1.setAccName("HDFC BANK");
		acc1.setAccNo("123456789");

		AccountC1 acc2 = new AccountC1();
		acc2.setAccName("AXIS BANK");
		acc2.setAccNo("5318367564");

		AccountC1 acc3 = new AccountC1();
		acc3.setAccName("ICICI BANK");
		acc3.setAccNo("912634712");

		AccountC1 acc4 = new AccountC1();
		acc4.setAccName("SBI BANK");
		acc4.setAccNo("452354545");

		AccountC1 acc5 = new AccountC1();
		acc5.setAccName("SBH BANK");
		acc5.setAccNo("232323333");

		Set<AccountC1> emp1Acc = new HashSet<AccountC1>();
		emp1Acc.add(acc1);
		emp1Acc.add(acc3);

		Set<AccountC1> emp2Acc = new HashSet<AccountC1>();
		emp2Acc.add(acc2);
		emp2Acc.add(acc5);

		Set<AccountC1> emp3Acc = new HashSet<AccountC1>();
		emp3Acc.add(acc4);

		emp1.setAccounts(emp1Acc);
		emp2.setAccounts(emp2Acc);
		emp3.setAccounts(emp3Acc);

		List<EmployeeC1> employees = new ArrayList<EmployeeC1>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		return employees;
	}

	private static List<EmployeeC2> generateJoinTableData() {
		EmployeeC2 emp1 = new EmployeeC2();
		emp1.setName("Bramaram Naik");
		emp1.setDesig("Module Lead");
		emp1.setEmail("Bramaram@gmail.com");
		emp1.setSalary(Double.valueOf(100000));

		EmployeeC2 emp2 = new EmployeeC2();
		emp2.setName("Naveen B");
		emp2.setDesig("Senior Techinal Lead");
		emp2.setEmail("Naveen@gmail.com");
		emp2.setSalary(Double.valueOf(130000));

		EmployeeC2 emp3 = new EmployeeC2();
		emp3.setName("Abhishek G");
		emp3.setDesig("CEO");
		emp3.setEmail("Abhishek@gmail.com");
		emp3.setSalary(Double.valueOf(80000));

		AccountC2 acc1 = new AccountC2();
		acc1.setAccName("HDFC BANK");
		acc1.setAccNo("123456789");

		AccountC2 acc2 = new AccountC2();
		acc2.setAccName("AXIS BANK");
		acc2.setAccNo("5318367564");

		AccountC2 acc3 = new AccountC2();
		acc3.setAccName("ICICI BANK");
		acc3.setAccNo("912634712");

		AccountC2 acc4 = new AccountC2();
		acc4.setAccName("SBI BANK");
		acc4.setAccNo("452354545");

		AccountC2 acc5 = new AccountC2();
		acc5.setAccName("SBH BANK");
		acc5.setAccNo("232323333");

		Set<AccountC2> emp1Acc = new HashSet<AccountC2>();
		emp1Acc.add(acc1);
		emp1Acc.add(acc3);

		Set<AccountC2> emp2Acc = new HashSet<AccountC2>();
		emp2Acc.add(acc2);
		emp2Acc.add(acc5);

		Set<AccountC2> emp3Acc = new HashSet<AccountC2>();
		emp3Acc.add(acc4);

		emp1.setAccounts(emp1Acc);
		emp2.setAccounts(emp2Acc);
		emp3.setAccounts(emp3Acc);

		List<EmployeeC2> employees = new ArrayList<EmployeeC2>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		return employees;
	}

	public static void saveOneToManyData(Session session) {
		List<EmployeeC1> employees = generateOneToManyData();
		employees.forEach((emp) -> {
			Serializable generatedId = session.save(emp);
			log.info(" SAVING EMPLOYEE SAVED ----> " + generatedId);
		});
	}

	public static void saveJoinTableData(Session session) {
		List<EmployeeC2> employees = generateJoinTableData();
		employees.forEach((emp) -> {
			Serializable generatedId = session.save(emp);
			log.info(" SAVING EMPLOYEE SAVED ----> " + generatedId);
		});
	}
}
