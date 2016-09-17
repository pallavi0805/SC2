package com.User.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.model.Users;

public class UserDAO {
	private EntityManagerFactory emfactory = Persistence
			.createEntityManagerFactory("users");
	private EntityManager em = emfactory.createEntityManager();

	public Users getUser(String emailId, String password) {
		try {
			Query q = em
					.createQuery("SELECT u from Users u where u.email_id = :EMAIL_ID and u.password = :PASSWORD");
			q.setParameter("EMAIL_ID", emailId);
			q.setParameter("PASSWORD", password);
			Users user = (Users) q.getSingleResult();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
