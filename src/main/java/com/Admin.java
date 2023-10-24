package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Admin
 */
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw =response.getWriter();
		pw.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "    <title>Admin Portal</title>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n"
				+ "    <style>\r\n"
				+ "        body {\r\n"
				+ "            font-family: Arial, sans-serif;\r\n"
				+ "            background-color: #f0f0f0;\r\n"
				+ "            margin: 0;\r\n"
				+ "            padding: 0;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .header {\r\n"
				+ "            background-color: #333;\r\n"
				+ "            color: #fff;\r\n"
				+ "            text-align: center;\r\n"
				+ "            padding: 20px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .button-container {\r\n"
				+ "            text-align: center;\r\n"
				+ "            margin-top: 50px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .admin-button {\r\n"
				+ "            background-color: #333;\r\n"
				+ "            color: #fff;\r\n"
				+ "            padding: 15px 30px;\r\n"
				+ "            border: none;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "            cursor: pointer;\r\n"
				+ "            margin: 10px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .admin-button:hover {\r\n"
				+ "            background-color: #555;\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <div class=\"header\">\r\n"
				+ "        <h1>Admin Portal</h1>\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"container\">\r\n"
				+ "        <div class=\"row button-container\">\r\n"
				+ "            <div class=\"col-md-4\">\r\n"
				+ "                <button class=\"admin-button btn btn-primary\" onclick=\"window.location.href='Flights.jsp'\">Create Flights</button>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"col-md-4\">\r\n"
				+ "                <button class=\"admin-button btn btn-success\" onclick=\"window.location.href='Place.jsp'\">Manage Places</button>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"col-md-4\">\r\n"
				+ "                <button class=\"admin-button btn btn-info\" onclick=\"window.location.href='Airline.jsp'\">Add Airlines</button>\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "    </div>\r\n"
				+ "    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n"
				+ "    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js\"></script>\r\n"
				+ "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "");
	}

}
