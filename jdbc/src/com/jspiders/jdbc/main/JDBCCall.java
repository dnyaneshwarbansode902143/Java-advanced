package com.jspiders.jdbc.main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCall {
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static CallableStatement callableStatement;
	private static String query;
	
	public static void main(String[] args) {
		try {
			openConnection();
			query="call sort()";
			callableStatement=connection.prepareCall(query);
			callableStatement.execute(query);
			resultSet= callableStatement.getResultSet();
			while (resultSet.next()) {
				System.out.println(resultSet.getString(2));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver= new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1", "root", "root");
		
		
	}
   private static void closeConnection() throws SQLException {
		if (resultSet!=null) {
			resultSet.close();
			
		}
		if (callableStatement!= null) {
			callableStatement.close();
			
		}
		if (connection!=null) {
			connection.close();
			
		}
		if (driver!=null) {
			DriverManager.deregisterDriver(driver);
			
		}
   }

}
