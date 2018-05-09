package com.frank.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(2);
		s.setName("frank");
		s.setAge(22);
		
		Configuration cfg = new Configuration();
		
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.save(s);
		
		session.getTransaction().commit();
		
		session.close();
		sf.close();
		
	}

}
