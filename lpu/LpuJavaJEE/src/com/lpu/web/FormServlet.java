package com.lpu.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lpu.domain.Employee;



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
		//pw.append("<h1>Hi From Server!</>");
		String fname = request.getParameter("fname");
		Integer id = Integer.parseInt(fname);
		String lname = request.getParameter("lname");
		//pw.append("Welcome "+fname+" "+lname );
		Connection con=null;
		  try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            System.out.println("Class not found " + e);
	        }
		try {
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", 
				"root", "full2work");
		String sql = "Select * from Employees where employee_id between 100 and ?";
		 
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		List<Employee> ls = new ArrayList();
		while(rs.next()) {
			Employee emp = new Employee(rs.getString(2), rs.getInt(1), rs.getDouble(8));
			ls.add(emp);
			pw.append("<table style=\"border:2px solid red;\" >");
			pw.append("<tr>");
			pw.append("<td style=\"border:2px solid blue;\" >");
			pw.append(" "+rs.getInt(1));
			pw.append("</td>");
			pw.append("<td style=\"border:2px solid blue;\" >");
			pw.append(" "+rs.getString(2));
			pw.append("</td>");
			pw.append("<td style=\"border:2px solid blue;\" >");
			pw.append(" "+rs.getString(3));
			pw.append("</td>");
			pw.append("<td style=\"border:2px solid blue;\" >");
			pw.append(" "+rs.getString(4));
			pw.append("</td>");
			pw.append("<td style=\"border:2px solid blue;\" >");
			pw.append(" "+rs.getString(5));
			pw.append("</td>");
			pw.append("</tr>");
			pw.append("</table>");
			
			
		}
		request.setAttribute("empList", ls);
		request.getRequestDispatcher("/emp").forward(request, response);
		
		
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
		//response.getWriter().append("In Post");
		doGet(request, response);
	}

}
