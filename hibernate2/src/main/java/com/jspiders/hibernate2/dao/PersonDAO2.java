package com.jspiders.hibernate2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate2.dto.Aadhar;
import com.jspiders.hibernate2.dto.Person;

public class PersonDAO2 {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	
	public static void main(String[] args) {
		openConnection();
		entityTransaction.begin();
	Person person=entityManager.find(Person.class, 5);
	Aadhar aadhar = entityManager.find(Aadhar.class, 5);
	if (person!= null) {
		if (aadhar!=null) {
			entityManager.remove(person);
			entityManager.remove(aadhar);
		}else {
		System.out.println("Aadhar does nort exist");
	}
	}else {
		System.out.println("Person does not exist");
	}
	entityTransaction.commit();
	closeConnection();
		
	}
	private static void openConnection() {
		entityManagerFactory=Persistence.createEntityManagerFactory("person");
		entityManager= entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}
	private static void closeConnection() {
		if (entityManagerFactory!=null) {
			entityManagerFactory.close();
			
		}
		if (entityManager!=null) {
			entityManager.clear();
			
		}
		if (entityTransaction!=null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
				
			}
			
		}
	}

}
