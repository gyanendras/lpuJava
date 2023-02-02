package com.lpu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/processform")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw =response.getWriter();
		pw.append("<h1>Hi From Server!</>");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		pw.append("Welcome "+fname+" "+lname );
		Connection con=null;
		  try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            System.out.println("Class not found " + e);
	        }
		try {
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", 
				"root", "full2work");
		String sql = "Select * from Employees where first_name = ?";
		 
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, fname);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			pw.append(" "+rs.getInt(1));
			pw.append(" "+rs.getString(2));
			pw.append(" "+rs.getString(3));
			pw.append(" "+rs.getString(4));
			pw.append(" "+rs.getString(5));
			
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
