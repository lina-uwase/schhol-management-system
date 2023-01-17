package rw.ac.rca.smis.smisApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import rw.ac.rca.smis.orm.*;

import java.util.Date;

public class Starter {
    public static void main(String[] args) {

        //initializing objects

        Address add1 = new Address("kigali","KK509","PoBox 3325");
        Date date= new Date();
        Student st1 = new Student("lina",16,"1m22cm","F",date);
        Course c1 = new Course("java",22,"5hours/week");
        Mark m1 = new Mark(78.5);
        Instructor ins1 = new Instructor("Lina","m",date);

        m1.setStudent(st1);
        m1.setCourse(c1);
        st1.setCourse(c1);
        st1.setAddress(add1);
        ins1.setAddress(add1);

        //Creating session object

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        //open transaction

        Transaction transaction = session.beginTransaction();

        //Saving objects


        session.saveOrUpdate(add1);
        session.saveOrUpdate(st1);
        session.saveOrUpdate(m1);
        session.saveOrUpdate(c1);

        System.out.println("Committing transaction....");
        transaction.commit();

        //closing connection
        System.out.println("Before closing session");
        session.close();
        factory.close();


    }
}
