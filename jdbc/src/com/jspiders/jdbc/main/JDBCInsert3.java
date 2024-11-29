package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert3 {
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	public static void main(String[] args) {
		try {
			openConnection();
			statement= connection.createStatement();
			query=("insert into user values(1,'Ramesh','ramesh4488@mail.com','Ramesh@123', 9021433771),(2,'Suresh','suresh@gmail.com','Suresh@123',9021433771),(3,'Mahesh','mahesh@gmail.com','mahesh@123',9021433771),(4,'Ajay','ajay@gmail.com','ajay@123',9021433771),(5,'Vijay','vijay@gmail.com','vijay@123',9021433771)");
			boolean res=statement.execute(query);
			System.out.println(res);
			System.out.println("Data inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				closeConnection();
				
			} catch (Exception e2) {
			e2.printStackTrace();
			}
		}
		
		
	}
	
	private static void openConnection() throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 driver = new com.mysql.cj.jdbc.Driver();
		 DriverManager.registerDriver(driver);
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1?user=root&&password=root");
		 
	}
	private static void closeConnection() throws SQLException {
		if (statement!=null) {
			statement.close();
			
		}
		if (connection!=null) {
			connection.close();
			
		}
		if (driver!=null) {
			DriverManager.deregisterDriver(driver);
			
		}
		
	}

}
