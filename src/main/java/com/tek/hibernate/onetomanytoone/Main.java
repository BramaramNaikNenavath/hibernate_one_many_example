package com.tek.hibernate.onetomanytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtil.getSessionFactory(); Session session = factory.openSession();) {
			// uncomment If you want to use one-to-many
			//HibernateOneToManyExample.saveEmployee("onetomany", session); 
			
			// comment if you want to use one-to-many
			HibernateOneToManyExample.saveEmployee("jointable", session);
		}
	}
}
