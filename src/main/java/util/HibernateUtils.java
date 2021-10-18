package util;g

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dominio.Persona;


public class HibernateUtils {
	
private static SessionFactory factory = null;
	
	public static synchronized SessionFactory getSessionFactory() {
		if(factory == null) {
			factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Persona.class)
										.buildSessionFactory();
		}
		
		return factory;
	}

}
