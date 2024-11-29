package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect5 {
	
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static String query;
	
	public static void main(String[] args) {
		try {
			openConnection();
			statement=connection.createStatement();
			query="SELECT * FROM user WHERE name like '%jay%'";
			boolean res=statement.execute(query);
			System.out.println(res);
			resultSet= statement.getResultSet();
			
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				System.out.println(resultSet.getLong(5));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver= new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1", "root", "root");
	}
	private static void closeConnection() throws SQLException {
		if (resultSet!=null) {
			resultSet.close();
			
		}
		if (connection!=null) {
			connection.close();
			
		}
		if (statement!=null) {
			statement.close();
			
		}
		if (driver!=null) {
			DriverManager.deregisterDriver(driver);
			
		}
		
	}

}
