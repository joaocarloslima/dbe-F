package br.com.fiap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.model.Setup;

public class SetupDAO {

	public void create(Setup setup) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("progamer");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(setup);
		manager.getTransaction().commit();
		
		manager.close();
	
	}

}
