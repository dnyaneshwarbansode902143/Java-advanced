package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete {
	
	private static Driver driver;
	private static Statement statement;
	private static String query;
	private static Connection connection;
	
	public static void main(String[] args) {
		try {
			openconnection();
			statement=connection.createStatement();
			query= "DELETE FROM student WHERE id =2";
			boolean res=statement.execute(query);
			System.out.println(res);
			System.out.println("row(s) affected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				closeconnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	private static void openconnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver= new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1","root","root");	
	}
	private static void closeconnection() throws SQLException
	{
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
