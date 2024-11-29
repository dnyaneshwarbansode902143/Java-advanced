package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc2 {
	
	private static Connection connection;
	private static ResultSet resultSet;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args) throws SQLException {
		openConnection();
		
		
		query = "select * from user";
		preparedStatement = connection.prepareStatement(query);
		resultSet = preparedStatement.executeQuery();
		if(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
		}
		closeConnection();
		
	}
	
	public static void openConnection() throws SQLException{
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1","root","root");
	}
	
	public static void closeConnection() throws SQLException{
		if (connection != null) {
			connection.close();
		}
		if (preparedStatement != null) {
			preparedStatement.close();
		}
	}
	
	

}
