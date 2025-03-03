package com.practice.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started.." );
        Configuration cfg = new Configuration();
        
        
        SessionFactory factory = cfg.configure().buildSessionFactory();
        
        Product product = new Product();
        product.setProduct_id(1);
        product.setProduct_name("Iphone 12 Pro");
        product.setBrand("Apple");
        product.setPrice(150000);
        
        System.out.println(product);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(product);
        tx.commit();
        
        session.close();
    }
}
