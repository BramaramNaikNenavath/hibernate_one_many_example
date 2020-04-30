package com.tek.hibernate.onetomanytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;
import com.tek.hibernate.beans.Employee;
import com.tek.hibernate.beans.Employer;

public class MappedByExmaple {
	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtil.getSessionFactory(); Session session = factory.openSession();) {
			Employer employer = new Employer();
			employer.setEmployerName("IBM");
			employer.setEmployerAddress("HYD");

			Employee employee1 = new Employee();
			employee1.setFirstName("Naveen");
			employee1.setLastName("B");
			employee1.setEmployer(employer);

			Employee employee2 = new Employee();
			employee2.setFirstName("Abhishek");
			employee2.setLastName("G");
			employee2.setEmployer(employer);

			Transaction transaction = session.beginTransaction();
			session.save(employer);
			session.save(employee1);
			session.save(employee2);

			transaction.commit();
			session.close();
		}
	}
}
