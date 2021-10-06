package app;

import java.awt.EventQueue;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import gui.Principal;

public class App {

	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {

		emf = Persistence.createEntityManagerFactory("aplicacion");
		manager = emf.createEntityManager();

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
