package com.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductDemo {

    public static void main(String[] args) {
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Product.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

      
        Product p = new Product();
        p.setCname("abs");
        p.setId(2);
        p.setPrice(1500);
        p.setColor("blue");
        p.setPname("abs");

        System.out.println(p);

       
        ss.save(p);
        tr.commit();

      
        ss.close();
        sf.close();

        System.out.println("Application is Started...");
    }
}
