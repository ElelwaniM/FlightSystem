package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class UserBookingConfirmaion
 */
public class UserBookingConfirmaion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserBookingConfirmaion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        DbCon con= new DbCon()
;	        // Assuming you have a valid database connection, retrieve the data from the database
	        Connection connection = null;
			try {
				connection = con.getCon();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Replace with your actual connection code
	        if (connection != null) {
	            try {
	                java.sql.Statement statement = connection.createStatement();
	                String query = "SELECT flightID, AirlineName, u.firstname, u.lastname, b.NumofPassengers AS 'Total Payable', departuredate, arrivaldate, departuretime, arrivaltime " +
	                        "FROM flight f, airlines a, Booking b, users u " +
	                        "WHERE f.airline = a.airlineID AND b.username = u.userid";
	                ResultSet resultSet = statement.executeQuery(query);

	                // Generate HTML table to display the data
	                out.println("<style>\r\n"
	                		+ "        body {\r\n"
	                		+ "            font-family: Arial, sans-serif;\r\n"
	                		+ "            background-color: #f0f0f0;\r\n"
	                		+ "            margin: 0;\r\n"
	                		+ "            padding: 0;\r\n"
	                		+ "        }\r\n"
	                		+ "        \r\n"
	                		+ "        h1, footer {\r\n"
	                		+ "            background-color: #333;\r\n"
	                		+ "            color: #fff;\r\n"
	                		+ "            text-align: center;\r\n"
	                		+ "            padding: 10px;\r\n"
	                		+ "        }\r\n"
	                		+ "        \r\n"
	                		+ "        form {\r\n"
	                		+ "            max-width: 400px;\r\n"
	                		+ "            margin: 0 auto;\r\n"
	                		+ "            background-color: #fff;\r\n"
	                		+ "            padding: 20px;\r\n"
	                		+ "            border-radius: 5px;\r\n"
	                		+ "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);\r\n"
	                		+ "        }\r\n"
	                		+ "        \r\n"
	                		+ "        label {\r\n"
	                		+ "            display: block;\r\n"
	                		+ "            margin-top: 10px;\r\n"
	                		+ "        }\r\n"
	                		+ "        \r\n"
	                		+ "        input[type=\"text\"],\r\n"
	                		+ "        input[type=\"password\"] {\r\n"
	                		+ "            width: 100%;\r\n"
	                		+ "            padding: 10px;\r\n"
	                		+ "            margin-top: 5px;\r\n"
	                		+ "            border: 1px solid #ccc;\r\n"
	                		+ "            border-radius: 3px;\r\n"
	                		+ "        }\r\n"
	                		+ "        \r\n"
	                		+ "        input[type=\"submit\"],\r\n"
	                		+ "        input[type=\"reset\"] {\r\n"
	                		+ "            background-color: #333;\r\n"
	                		+ "            color: #fff;\r\n"
	                		+ "            padding: 10px 20px;\r\n"
	                		+ "            border: none;\r\n"
	                		+ "            border-radius: 3px;\r\n"
	                		+ "            cursor: pointer;\r\n"
	                		+ "            margin-top: 10px;\r\n"
	                		+ "        }\r\n"
	                		+ "        \r\n"
	                		+ "        input[type=\"submit\"]:hover,\r\n"
	                		+ "        input[type=\"reset\"]:hover {\r\n"
	                		+ "            background-color: #555;\r\n"
	                		+ "        }\r\n"
	                		+ "        \r\n"
	                		+ "        .button-container {\r\n"
	                		+ "            text-align: center;\r\n"
	                		+ "        }\r\n"
	                		+ "        \r\n"
	                		+ "        .register-link {\r\n"
	                		+ "            text-align: center;\r\n"
	                		+ "            margin-top: 20px;\r\n"
	                		+ "        }\r\n"
	                		+ "    </style>");
	                out.println("<html><head><title>Flight List</title></head><body>");
	                out.println("<h1>Flight List</h1>");
	                out.println("<table border='1'><tr><th>Flight ID</th><th>Airline</th><th>First Name</th><th>Last Name</th><th>Total Payable</th><th>Departure Date</th><th>Arrival Date</th><th>Departure Time</th><th>Arrival Time</th></tr>");

	                while (resultSet.next()) {
	                    out.println("<tr>");
	                    out.println("<td>" + resultSet.getString("flightID") + "</td>");
	                    out.println("<td>" + resultSet.getString("AirlineName") + "</td>");
	                    out.println("<td>" + resultSet.getString("firstname") + "</td>");
	                    out.println("<td>" + resultSet.getString("lastname") + "</td>");
	                    out.println("<td>" + resultSet.getString("Total Payable") + "</td>");
	                    out.println("<td>" + resultSet.getString("departuredate") + "</td>");
	                    out.println("<td>" + resultSet.getString("arrivaldate") + "</td>");
	                    out.println("<td>" + resultSet.getString("departuretime") + "</td>");
	                    out.println("<td>" + resultSet.getString("arrivaltime") + "</td>");
	                    out.println("</tr>");
	                }

	                out.println("</table><footer>\r\n"
	                		+ "        Developed by Elelwani Magoba<br>\r\n"
	                		+ "        You can contact me at email: <a href=\"mailto:elelwanimagoba@gmail.com\">elelwanimagoba@gmail.com</a>\r\n"
	                		+ "    </footer></body></html>");
	            } catch (SQLException e) {
	                e.printStackTrace();
	                out.println("An error occurred while retrieving data from the database.");
	            }
	}

}
}