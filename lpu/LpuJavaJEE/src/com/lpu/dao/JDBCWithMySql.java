package com.lpu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.lpu.domain.Employee;

public class JDBCWithMySql {
	static Connection con;
	
	public static void insertWithParams(int regId, String regName) {
		try {
			con =
					DriverManager.getConnection
					("jdbc:mysql://localhost:3306/hr", 
							"root", "full2work");
		
		System.out.println(con);
		String sql = "insert into regions values(?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, regId);
		ps.setString(2,regName);
		ps.execute();
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
	
	public static void insert() {
		try {
			con =
					DriverManager.getConnection
					("jdbc:mysql://localhost:3306/hr", 
							"root", "full2work");
		
		System.out.println(con);
		Statement stmt = con.createStatement();
		String sql = "insert into regions values(7,'New7')";
		boolean success = stmt.execute(sql);
		System.out.println(success);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			 con =
					DriverManager.getConnection
					("jdbc:mysql://localhost:3306/hr", 
							"root", "full2work");
			System.out.println(con);
			Statement stmt = con.createStatement();
			String sql = "select * from employees where employee_id = ?";
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
