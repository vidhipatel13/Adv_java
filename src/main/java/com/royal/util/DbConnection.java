package com.royal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
		
	public static void main(String[] args) {
		String dbUrl ="";
		String dbUserName="root";
		String dbPassword="root";
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection =DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
			
			System.out.println("connection =>" +connection);
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
