package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.x.protobuf.MysqlxCursor.Open;

public class JDBCSelect3 {
  private static Driver driver;
  private static Connection connection;
  private static ResultSet resultSet;
  private static PreparedStatement preparedStatement;
  private static String query;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the email id");
		String email = scanner.nextLine();
		System.out.println("Enter the password");
		String password = scanner.nextLine();
		scanner.close();
		try {
			openConnection();
			query="SELECT * FROM student WHERE email=? AND password=?";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
            	System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				System.out.println("Loggged in");
			}
            else {
            	System.out.println("Invalid email or password");
            	System.out.println("try again!!!");
            }
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
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1", "root", "root");
		
	}
private static void closeConnection() throws SQLException {
	if (preparedStatement!=null) {;
	preparedStatement.close();
		
	}
	if (connection!=null) {
		connection.close();
		
	}
	if (driver!=null) {
		DriverManager.deregisterDriver(driver);
	}
		
	}
}
