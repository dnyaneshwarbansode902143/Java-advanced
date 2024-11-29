package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect {
	private static Driver driver;
	private static Statement statement;
	private static Connection connection;
	private static String query;
	private static ResultSet resultSet;
	public static void main(String[] args) {
		try {
			openconnection();
			statement=connection.createStatement();
			query= "SELECT * FROM student";
			boolean res=statement.execute(query);
			System.out.println(res);
			resultSet= statement.getResultSet();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				//System.out.println(resultSet.getString(5));
			}
		} catch (Exception e) {
          e.printStackTrace();
		}
		finally {
			try {
				closeconnection();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	private static void openconnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1?user=root&&password=root");
	}
	private static void closeconnection() throws SQLException {
		if (resultSet!=null) {
			resultSet.close();
			
		}
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
