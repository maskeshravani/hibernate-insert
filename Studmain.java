package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employee.employe;

public class Studmain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Stud.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Stud sh = new Stud();
		sh.setName("Abhijeet");
		sh.setRollNo(4);
		sh.setAddress("Pune");
		sh.setMarks(87);
		sh.setMobino(985687665);
		System.out.println(sh);
		
		ss.save(sh);
		tr.commit();
		ss.close();
		sf.close();
		
		System.out.println("Application is Started...");

	}

}
