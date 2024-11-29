package com.jspiders.hibernate5.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate5.dto.Student;
import com.jspiders.hibernate5.dto.Subject;

public class StudentDAO {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
		Subject subject1 = new Subject();
		subject1.setName("CORE JAVA");
		subject1.setFees(10000);
		
		Subject subject2 = new Subject();
		subject2.setName("SQL");
		subject2.setFees(5000);
		
		List<Subject> subjects = new ArrayList<>();
		subjects.add(subject1);
		subjects.add(subject2);
		
		Student student1 = new Student();
		student1.setName("Dnyanesh");
		student1.setEmail("dnyaneshwarbansode4488@gmail.com");
		student1.setMobile(9021433771l);
		student1.setSubjects(subjects);
		
		Student student2 = new Student();
		student2.setName("Vaibhav");
		student2.setEmail("vaibhavvaidya123@gmail.com");
		student2.setMobile(9021433772l);
		student2.setSubjects(subjects);
		
		openConnection();
		entityTransaction.begin();
		entityManager.persist(subject1);
		entityManager.persist(subject2);
		entityManager.persist(student1);
		entityManager.persist(student2);
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
