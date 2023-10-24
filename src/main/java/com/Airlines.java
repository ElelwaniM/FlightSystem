package com;

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
 * Servlet implementation class Airlines
 */
public class Airlines extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Airlines() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String placeid;
		String placeName;	
		PrintWriter pw =response.getWriter();
		
		placeid=request.getParameter("airlineid");
		placeName= request.getParameter("airlinename");
		
		DbCon connection =new DbCon();
		
		String insertQuery= "Insert into airlines values (?,?)";
		try (PreparedStatement preparedStatement = connection.getCon().prepareStatement(insertQuery)) {
		    preparedStatement.setString(1, placeid);
		    preparedStatement.setString(2, placeName);
		    preparedStatement.executeUpdate();
		    response.sendRedirect("Success");
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
	    	response.sendRedirect("Error");
			e.printStackTrace();
		}	}

}
