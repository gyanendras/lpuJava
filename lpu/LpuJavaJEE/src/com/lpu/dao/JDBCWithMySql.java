package com.lpu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCWithMySql {

	public static void main(String[] args) {
		try {
			Connection con =
					DriverManager.getConnection
					("jdbc:mysql://localhost:3306/hr", 
							"root", "full2work");
			System.out.println(con);
			Statement stmt = con.createStatement();
			String sql = "select * from employees";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " " + rs.getString(2));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 

	}

}
