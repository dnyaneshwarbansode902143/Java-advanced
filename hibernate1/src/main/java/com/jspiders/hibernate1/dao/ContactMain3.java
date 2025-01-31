package com.jspiders.hibernate1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate1.dto.Contact;

public class ContactMain3 {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		openConnection();
		Contact contact=entityManager.find(Contact.class, 3);
		if (contact!=null) {
		contact.setEmail("dnyaneshwarbansode3366@gmail.com");
		entityTransaction.begin();
		entityManager.persist(contact);
		entityTransaction.commit();
			
		}
		else {
			System.out.println("Contact does not exist");
		}
		closeConnection();
		
	}
	
	private static void openConnection() {
		entityManagerFactory=Persistence.createEntityManagerFactory("contact_manager");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
	}
	private static void closeConnection() {
		if (entityManagerFactory!=null) {
			entityManagerFactory.close();	
		}
		if (entityManager!=null) {
			entityManager.close();
				
		}
		if (entityTransaction!=null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
				
			}
			
		}
	}

}
