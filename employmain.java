package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class employmain {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(employe.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		employe e = new employe();
		e.setName("Abhijeet");
		e.setId(2);
		e.setAddress("Pune");
		e.setSalary(560000);
		e.setMobno(983487769);
		System.out.println(e);
		
		ss.save(e);
		tr.commit();
		ss.close();
		sf.close();
		
		System.out.println("Application is Started...");
	}

}
