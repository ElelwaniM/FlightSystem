package com;
import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class SimpleServlet
 */
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    String user =null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String s;
		//InsertDB dB = new InsertDB();
		PrintWriter pw =response.getWriter();
		 String userID;
		 String userName;
		 String password;
		 String firstName;
		 String lastName;
		 String phoneNumber;
		 String address;
		 String email;
		 
		 userID=request.getParameter("userid");
		 userName=request.getParameter("username");
		 password=request.getParameter("password");
		 firstName=request.getParameter("firstname");
		 lastName=request.getParameter("lastname");
		 email=request.getParameter("email");
		 phoneNumber=request.getParameter("phoneNumber");
		 address=request.getParameter("address"); 

		 
		
	
		
		InsertDB inDB= new InsertDB();
		DbCon connection =new DbCon();
	    try {
	    	
	    inDB.insertIntoDB(connection.getCon(),userID,userName,password,firstName,lastName,email,phoneNumber,address);
	    response.sendRedirect("Success");
	    
	    }  catch (SQLException e) {
	    	response.sendRedirect("Error");
	        System.err.println("Error connecting to the database: " + e.getMessage());
	    }
		
		pw.close();
		
		
		
		
	}
	private void setUserID(String userID)
	{
		user=userID;
	}
	
	
	public String getUserID()
	{
		return user;
	}

}
