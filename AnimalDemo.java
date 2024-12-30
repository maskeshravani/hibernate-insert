package com.animal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AnimalDemo {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Animal.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        Animal animal = new Animal(6, "Cat", "Black", "Meww", "Meat");
        ss.save(animal);

        System.out.println("Animal saved: " + animal);

        tr.commit();
        ss.close();
        sf.close();
        

        System.out.println("Application is Ended...");
    }
}
