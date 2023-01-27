package com.lpu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCWithMySql {

	public static void main(String[] args) {
		try {
			Connection con =
					DriverManager.getConnection
					("jdbc:mysql://localhost:3306/hr", 
							"root", "full2work");
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 

	}

}
