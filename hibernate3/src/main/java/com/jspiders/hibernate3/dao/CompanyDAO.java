package com.jspiders.hibernate3.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate3.dto.Company;
import com.jspiders.hibernate3.dto.Employee;

public class CompanyDAO {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setName("Dnyanesh");
		employee1.setEmail("dnyaneshwarbansode4488@gmail.com");
		employee1.setMobile(9021433771l);
		
		Employee employee2 = new Employee();
		employee2.setName("Mahesh");
		employee2.setEmail("mahesh123@gmail.com");
		employee2.setMobile(9021433772l);
		
		List<Employee>employees= new  ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		
		Company company = new Company();
		company.setName("TATA");
		company.setLocation("Pune");
		company.setEmployees(employees);
		
		openConnection();
		entityTransaction.begin();
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityManager.persist(company);
		entityTransaction.commit();
		closeConnection();
	}
	private static void openConnection() {
		entityManagerFactory=Persistence.createEntityManagerFactory("company");
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
