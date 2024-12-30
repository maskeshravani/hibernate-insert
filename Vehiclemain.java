package com.vehicle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.animal.Animal;

public class Vehiclemain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Vehicle.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        Vehicle v = new Vehicle();
        v.setComNmae("Toyato");
        v.setColor("white");
        v.setId(8);
        v.setName("Car");
        v.setPrise(700000);
        
        System.out.println(v);
        
        ss.save(v);
        tr.commit();
        ss.close();
        sf.close();
        
        System.out.println("Application is Started...");
	}

}
