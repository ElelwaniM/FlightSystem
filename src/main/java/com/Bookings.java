package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Servlet implementation class Bookings
 */
public class Bookings extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bookings() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String s;
		//InsertDB dB = new InsertDB();
		PrintWriter pw =response.getWriter();
		 String userid;
		 String source;
		 String destination;
		 String numOfPassangers;
		 String Date;
		 String cardNo;
		 String cardHolderName;
		 String cvv;
		
		 LoginServelt getUserID = new LoginServelt();
		 userid=request.getParameter("UserID");
		 source=request.getParameter("Source");
		 destination=request.getParameter("Destination");
		 numOfPassangers=request.getParameter("Passengers");
		 Date=request.getParameter("Date");
		 cardNo=request.getParameter("CardNumber");
		 cardHolderName=request.getParameter("CardHolderName");
		 cvv=request.getParameter("CVV");
 

		 
		
	
		
		InsertDB inDB= new InsertDB();
		DbCon connection =new DbCon();
	    try {
	    inDB.insertIntoBookings(connection.getCon(), userid, source, destination, numOfPassangers, Date, cardNo, cardHolderName, cvv);
	    response.sendRedirect("UserBookingConfirmaion");
	    
	    }  catch (SQLException e) {
	    	response.sendRedirect("Error");
	        //System.err.println("Error connecting to the database: " + e.getMessage());
	    }
		
		pw.close();
		
		
		
		
	}

}
