package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/emsystem";
	static final String username = "root";
	static final String password = "root";
	
	public static Connection initConnection() throws ClassNotFoundException {
		Connection conn = null;

		try {
		Class.forName(JDBC_DRIVER);     // old: [com.mysql.jdbc.Driver]   new: [com.mysql.cj.jdbc.Driver]
		conn = DriverManager.getConnection(url,username,password);
		System.out.println("DB Connection Successful!!!");
			
		}
		catch (SQLException e) {
			System.out.println("DB Connection Failed!!!");
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		return conn;
		
	}

}
