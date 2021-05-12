package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.fiap.model.User;
import br.com.fiap.util.EntityManagerFacade;

public class UserDAO {

	EntityManager manager = EntityManagerFacade.getEntityManager();

	public void create(User user) {
		
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		
		manager.close();
	
	}

	public List<User> getAll() {
		String jpql = "SELECT u FROM User u";
		TypedQuery<User> query = manager.createQuery(jpql, User.class);
		return query.getResultList();
	}

	public boolean exist(User user) {
		TypedQuery<User> query = manager.createQuery("SELECT u FROM User u WHERE "
							+ "u.email = :email AND "
							+ "u.password = :password", 
							User.class);
		
		query.setParameter("email", user.getEmail());
		query.setParameter("password", user.getPassword());

		try {
			query.getSingleResult();
		} catch (NoResultException e) {
			return false;
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	

}
