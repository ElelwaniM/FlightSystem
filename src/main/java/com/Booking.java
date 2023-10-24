package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Booking
 */
public class Booking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Booking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw =response.getWriter();
		pw.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "    <title>Flight Booking</title>\r\n"
				+ "    <style>\r\n"
				+ "        body {\r\n"
				+ "            font-family: Arial, sans-serif;\r\n"
				+ "            background-color: #f0f0f0;\r\n"
				+ "            margin: 0;\r\n"
				+ "            padding: 0;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        h1 {\r\n"
				+ "            background-color: #333;\r\n"
				+ "            color: #fff;\r\n"
				+ "            text-align: center;\r\n"
				+ "            padding: 10px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        form {\r\n"
				+ "            max-width: 600px;\r\n"
				+ "            margin: 0 auto;\r\n"
				+ "            background-color: #fff;\r\n"
				+ "            padding: 20px;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        label {\r\n"
				+ "            display: block;\r\n"
				+ "            margin-top: 10px;\r\n"
				+ "        }\r\n"
				+ "		\r\n"
				+ "		  h1, footer {\r\n"
				+ "            background-color: #333;\r\n"
				+ "            color: #fff;\r\n"
				+ "            text-align: center;\r\n"
				+ "            padding: 10px;\r\n"
				+ "        }\r\n"
				+ "		\r\n"
				+ "        input[type=\"text\"],\r\n"
				+ "        input[type=\"number\"],\r\n"
				+ "        input[type=\"date\"] {\r\n"
				+ "            width: 100%;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            margin-top: 5px;\r\n"
				+ "            border: 1px solid #ccc;\r\n"
				+ "            border-radius: 3px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .section-header {\r\n"
				+ "            background-color: #333;\r\n"
				+ "            color: #fff;\r\n"
				+ "            padding: 8px;\r\n"
				+ "            margin-top: 15px;\r\n"
				+ "            border-radius: 3px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .section-content {\r\n"
				+ "            padding: 15px;\r\n"
				+ "            border: 1px solid #ccc;\r\n"
				+ "            border-radius: 3px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .button-container {\r\n"
				+ "            text-align: center;\r\n"
				+ "            margin-top: 15px;\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h1>Flight Booking</h1>\r\n"
				+ "    <form method=\"get\" action=\"Bookings\">\r\n"
				+ "        <div class=\"section-header\">UserInfo</div>\r\n"
				+ "        <div class=\"section-content\">\r\n"
				+ "           <label for=\"destination\" class=\"col-form-label\">Source:</label>\r\n"
				+ "					<select class=\"form-select\" name=\"Source\" required>\r\n"
				+ "					<option selected>Select Destination</option>\r\n"
				+ "						<option value=\"2\">Kimberley(ZA)</option>\r\n"
				+ "						<option value=\"7\">Pretoria(ZA)</option>						\r\n"
				+ "						<option value=\"45\">Frans(ZA)</option>\r\n"
				+ "						<option value=\"789\">Johannesburg</option>\r\n"
				+ "						\r\n"
				+ "					</select>\r\n"
				+ "     \r\n"
				+ "        \r\n"
				+ "        <label for=\"destination\" class=\"col-form-label\">Destination:</label>\r\n"
				+ "					<select class=\"form-select\" name=\"Destination\" required>\r\n"
				+ "						<option selected>Select Destination</option>\r\n"
				+ "						<option value=\"2\">Kimberley(ZA)</option>\r\n"
				+ "						<option value=\"7\">Pretoria(ZA)</option>						\r\n"
				+ "						<option value=\"45\">Frans(ZA)</option>\r\n"
				+ "						<option value=\"789\">Johannesburg</option>\r\n"
				+ "						\r\n"
				+ "					</select>\r\n"
				+ "					\r\n"
				+ "			<label for=\"User\">UserID</label>\r\n"
				+ "            <input type=\"text\" id=\"UserID\" name=\"UserID\" required>\r\n"
				+ "\r\n"
				+ "            <label for=\"Passengers\">Number of Passengers:</label>\r\n"
				+ "            <input type=\"number\" id=\"Passengers\" name=\"Passengers\" required>\r\n"
				+ "\r\n"
				+ "            <label for=\"Date\">Date:</label>\r\n"
				+ "            <input type=\"date\" id=\"Date\" name=\"Date\" required>\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        <div class=\"section-header\">Payment Section</div>\r\n"
				+ "        <div class=\"section-content\">\r\n"
				+ "            <label for=\"CardNumber\">Card Number:</label>\r\n"
				+ "            <input type=\"text\" id=\"CardNumber\" name=\"CardNumber\" required>\r\n"
				+ "\r\n"
				+ "            <label for=\"CardHolderName\">Cardholder Name:</label>\r\n"
				+ "            <input type=\"text\" id=\"CardHolderName\" name=\"CardHolderName\" required>\r\n"
				+ "\r\n"
				+ "            <label for=\"CVV\">CVV:</label>\r\n"
				+ "            <input type=\"text\" id=\"CVV\" name=\"CVV\" required>\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        <div class=\"button-container\">\r\n"
				+ "            <input type=\"submit\" value=\"Book Flight\">\r\n"
				+ "            <input type=\"reset\" value=\"Clear\">\r\n"
				+ "        </div>\r\n"
				+ "    </form>\r\n"
				+ "    <footer>\r\n"
				+ "        Developed by Elelwani Magoba<br>\r\n"
				+ "        You can contact me at email: <a href=\"mailto:elelwanimagoba@gmail.com\">elelwanimagoba@gmail.com</a>\r\n"
				+ "    </footer>\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "");
				
	
	
	}

}
