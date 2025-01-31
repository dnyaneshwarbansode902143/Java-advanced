package com.jspiders.hibernate5.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate5.dto.Student;

public class StudentDAO2 {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		openConnection();
		Student student = entityManager.find(Student.class, 2);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		closeConnection();
		
		
	}
	
	 private static void openConnection() {
		 entityManagerFactory= Persistence.createEntityManagerFactory("student");
		 entityManager=entityManagerFactory.createEntityManager();
		 entityTransaction =entityManager.getTransaction();
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
