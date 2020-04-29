package com.tek.hibernate.onetomanytoone;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.EmployeeAccountData;

public class HibernateOneToManyExample {

	private static Logger log = Logger.getLogger(HibernateOneToManyExample.class);

	public static void saveEmployee(String saveType, Session session) {
		Transaction transaction = session.beginTransaction();
		if ("onetomany".equals(saveType)) {
			log.info("Saving One-To-Many Employee Details");
			EmployeeAccountData.saveOneToManyData(session);
		} else if ("jointable".equals(saveType)) {
			log.info("Saving Join Table Employee Details");
			EmployeeAccountData.saveJoinTableData(session);
		}
		transaction.commit();
	}

}
