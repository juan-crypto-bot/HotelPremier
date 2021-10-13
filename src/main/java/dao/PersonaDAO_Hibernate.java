package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dominio.Persona;
import util.HibernateUtils;

public class PersonaDAO_Hibernate implements PersonaDAO{
	
	public void guardarPersona(Persona persona) {
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx=null;
		
		try{
		    tx = session.beginTransaction();
		    
			session.save(persona);
			session.flush();	
			tx.commit();
			
		}catch(Exception ex){
			tx.rollback();	
			throw ex;
		}
		finally {
			if(session!=null && session.isOpen())
			session.close();
			
		}
		
	}

}
