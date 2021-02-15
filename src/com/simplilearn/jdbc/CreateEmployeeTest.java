package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployeeTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		Connection conn = null;
		Statement stm=null;
		
		try {
		// Get connection
		Class.forName(JDBC_DRIVER);
		conn = DBConnection.initConnection();
		// Create query
		stm=conn.createStatement();
		// Execute query
		String query="insert into EMPLOYEES "
		+"(FIRST_NAME,LAST_NAME,EMAIL,DEPARTMENT,SALARY) "
		+"values ('Stella', 'Darwin', 'stelladarwin@gmail.com', 'CEO', 876907.32)";
		
		int rowsAffected = stm.executeUpdate(query);
		System.out.println("Number of rows affected after INSERT query: "+rowsAffected);
		
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {
			if(stm!=null) {
				stm.close();
				
			}
			if(conn!=null) {
				conn.close();
				
			}
			
		}
		

	}

}
