package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
private static Connection  connection;
 private  static Statement statement;
 private static String query;
 private static ResultSet resultSet;
 public static void main(String[] args) throws SQLException {
	 
	 try {
		openConnection();
		statement=connection.createStatement();
		query ="select * from student";
		statement.execute(query);
		resultSet=statement.getResultSet();
		while(resultSet.next()) {
        System.out.println(resultSet.getInt(1));
        System.out.println(resultSet.getString(2));
        System.out.println(resultSet.getString(3));
		}
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	 
	 
	 closeConnection();
 }
	 public static void openConnection() throws SQLException {
		 connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1?user=root&password=root");
	 }
	 public static void closeConnection() throws SQLException {
		 if (statement!=null) {
			 statement.close();	
		}
		 if (connection!=null) {
			 connection.close();
			
		}
	 }
}
