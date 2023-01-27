package com.lpu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.lpu.domain.Employee;

public class JDBCWithMySql {
	static Connection con;
	public static void main(String[] args) {
		try {
			 con =
					DriverManager.getConnection
					("jdbc:mysql://localhost:3306/hr", 
							"root", "full2work");
			System.out.println(con);
			Statement stmt = con.createStatement();
			String sql = "select * from employees";
			ResultSet rs = stmt.executeQuery(sql);
			List lstEmp = new LinkedList();
			
			while(rs.next()) {
				String name = rs.getString(2) +" "+ rs.getString(3);
				Employee emp = new Employee(name,rs.getInt(1),rs.getDouble("salary"));
				lstEmp.add(emp);
			    
				System.out.println(rs.getInt(1)+ " " + rs.getString(2));
			   System.out.println(lstEmp.size());
			
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
