package com.jspiders.hibernate4.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate4.dto.Employee;
import com.jspiders.hibernate4.dto.Company;

public class EmployeeDAO {
	
	private  static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		Company company = new Company();
		company.setName("Tata");
		company.setLocation("pune");
		
		Employee employee1 = new Employee();
		employee1.setName("Dnyanesh");
		employee1.setEmail("dnyaneshwarbansode4488@gmail.com");
		employee1.setMobile(9021433771l);
		
		Employee employee2 = new Employee();
		employee2.setName("Mahesh");
		employee2.setEmail("mahesh123@gmail.com");
		employee2.setMobile(9021433772l);
		
		openConnection();
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityTransaction.commit();
		closeConnection();
		
	}
	
	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("employee");
		entityManager= entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
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
