package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCursor.Open;

public class JDBCUpdate1 {
	private static Driver driver;
	private static Connection connection;
	private static String query;
	private static  Statement statment;
	private static PreparedStatement preparedStatement;
	
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enetr new Pasword");
		String newpassword = scanner.nextLine();
		
		try {
			OpenConnection();
			query="UPDATE student SET password=? WHERE id =?";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, newpassword);
			preparedStatement.setInt(2, id);
			int res=preparedStatement.executeUpdate();
			System.out.println(res +"row(s) affected ");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	private static void OpenConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver= new com.mysql.cj.jdbc.Driver();
		DriverManager .registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1", "root", "root");
		
	}
private static void closeConnection() throws SQLException {
	if (preparedStatement!=null) {
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


