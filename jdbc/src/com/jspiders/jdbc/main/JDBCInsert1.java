package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert1 {
	
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) {
		try {
			openConnection();
			statement= connection.createStatement();
			query=("insert into student values(1,'Ram','ram4488@mail.com','ram@123'),(2,'jay','jay@gmail.com','jay@123')");
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
