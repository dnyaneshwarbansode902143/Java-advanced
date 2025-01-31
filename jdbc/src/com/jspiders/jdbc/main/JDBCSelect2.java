package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect2 {
	
	private static Driver driver;
	private static  Statement statement;
	private static Connection connection;
	private static String query;
	private static ResultSet resultSet;
	
	public static void main(String[] args) {
		try {
			openConnection();
			statement=connection.createStatement();
			query= "SELECT * FROM student WHERE id = 2";
			boolean res=statement.execute(query);
			System.out.println(res);
			resultSet=statement.getResultSet();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		try {
			closeConnection();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver= new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1","root","root");	
	}
	private static void closeConnection() throws SQLException {
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
