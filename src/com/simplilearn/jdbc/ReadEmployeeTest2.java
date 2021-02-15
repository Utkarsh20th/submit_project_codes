package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployeeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		
		try {
		
		// 1 Register driver
		Class.forName(JDBC_DRIVER);     // old: [com.mysql.jdbc.Driver]   new: [com.mysql.cj.jdbc.Driver]
		
		// 2 Create/Get connection
		Connection conn = DBConnection.initConnection();
		
		// 3 Create query statement
		Statement stm = conn.createStatement();
		
		// 4 Execute query
		String query = "select * from EMPLOYEES";
		ResultSet rest = stm.executeQuery(query);
		
		while (rest.next()) {
			System.out.println(rest.getInt("ID")
					+"   "+rest.getString("FIRST_NAME")
					+"   "+rest.getString("LAST_NAME")
					+"   "+rest.getString("EMAIL")
					+"   "+rest.getString("DEPARTMENT")
					+"   "+rest.getDouble("SALARY"));
			
		}
			
		}
		catch (SQLException e) {
			System.out.println("DB Connection Failed!!!");
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		finally {
			
			
		}
		
		
		

	}

}
