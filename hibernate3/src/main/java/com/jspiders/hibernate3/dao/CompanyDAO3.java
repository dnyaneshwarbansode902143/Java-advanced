package com.jspiders.hibernate3.dao;

import java.rmi.Remote;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate3.dto.Company;
import com.jspiders.hibernate3.dto.Employee;

public class CompanyDAO3 {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		openConnection();
		Company company=entityManager.find(Company.class, 4);
		List<Employee> employees = company.getEmployees();
		Employee employeeToBeDeleted= null;
		for(Employee employee : employees) {
			if (employee.getId()==12) {
				employeeToBeDeleted=employee;
				break;
				
			}
		}
		employees.remove(employeeToBeDeleted);
		company.setEmployees(employees);
		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();
		
		Employee employee= entityManager.find(Employee.class, 12);
		entityTransaction.begin();
		entityManager.remove(employee);
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
