package test;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Person;
import util.HibernateUtil;

public class testPerson {
public static void main(String[] args) {
	try {
		// Đối tượng giao tiếp với CSDL
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		if(sessionFactory!=null) {
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Person pr1 = session.get(Person.class, "pham dat");
			Person pr2 = new Person("Bui Kieu Anh", new Date(System.currentTimeMillis()), pr1);
			session.save(pr2);
			tr.commit();
			session.close();
			
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
