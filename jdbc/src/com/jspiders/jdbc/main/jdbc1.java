package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {

	public static void main(String[] args) throws SQLException {
		
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje1?user=root&password=root");
		
		Statement statement = connection.createStatement();
		
		statement.execute("insert into student values(7,'Abhay','abhay4488@mail.com'),(8,'jay','jay@gmail.com')");
		
		System.out.println("data inserted");
		
		statement.close();
		connection.close();
		
		DriverManager.deregisterDriver(driver);
		
	}
	
}