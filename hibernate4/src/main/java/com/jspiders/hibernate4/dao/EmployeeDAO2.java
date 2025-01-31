package com.jspiders.hibernate4.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate4.dto.Employee;

public class EmployeeDAO2 {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		  openConnection();
		 Employee employee = entityManager.find(Employee .class, 2);
		 entityTransaction.begin();
		 entityManager.remove(employee);
		 entityTransaction.commit();
		 closeConnction();
		
		
	}
	
	private  static void openConnection() {
		entityManagerFactory= Persistence.createEntityManagerFactory("employee");
		entityManager= entityManagerFactory.createEntityManager();
		entityTransaction= entityManager.getTransaction();
		
	}
     private static void closeConnction() {
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
