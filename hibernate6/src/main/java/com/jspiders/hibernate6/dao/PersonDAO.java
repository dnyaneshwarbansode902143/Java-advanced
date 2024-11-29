package com.jspiders.hibernate6.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate6.dto.Person;

public class PersonDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Dnyanesh");
		person.setEmail("dnyaneshwarbansode4488@gmail.com");
		openConnection();
		
		
	}
	private static void openConnection() {
		entityManagerFactory= Persistence.createEntityManagerFactory("person");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction= entityManager.getTransaction();
	}
	
	private static void closeConnection() {
		if (entityManagerFactory!=null) {
			entityManagerFactory.close();
			
		}
		if (entityManager!=null) {
			entityManager.close();
			
		}
		if (entityTransaction!=null){
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
				
			}
		}
			
		}
	}
		
