package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Success
 */
public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Success() {
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
				+ "    <title>Success</title>\r\n"
				+ "    <style>\r\n"
				+ "        body {\r\n"
				+ "            font-family: Arial, sans-serif;\r\n"
				+ "            background-color: #f0f0f0;\r\n"
				+ "            margin: 0;\r\n"
				+ "            padding: 0;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        h1 {\r\n"
				+ "            background-color: #333;\r\n"
				+ "            color: #fff;\r\n"
				+ "            text-align: center;\r\n"
				+ "            padding: 10px;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .message-container {\r\n"
				+ "            max-width: 400px;\r\n"
				+ "            margin: 0 auto;\r\n"
				+ "            background-color: #fff;\r\n"
				+ "            padding: 20px;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);\r\n"
				+ "            text-align: center;\r\n"
				+ "            animation: fade-in 0.5s ease-in;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .success-message {\r\n"
				+ "            color: #00cc00;\r\n"
				+ "            font-weight: bold;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .return-link {\r\n"
				+ "            text-align: center;\r\n"
				+ "            margin-top: 20px;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        @keyframes fade-in {\r\n"
				+ "            from {\r\n"
				+ "                opacity: 0;\r\n"
				+ "            }\r\n"
				+ "            to {\r\n"
				+ "                opacity: 1;\r\n"
				+ "            }\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h1>Success</h1>\r\n"
				+ "    <div class=\"message-container\">\r\n"
				+ "        <p class=\"success-message\">Record Successfully installed</p>\r\n"
				+ "    </div>\r\n"
				+ "    \r\n"
				+ "    <div class=\"return-link\">\r\n"
				+ "        <p>Return to <a href=\"Admin\">Login</a></p>\r\n"
				+ "    </div>\r\n"
				+ "    \r\n"
				+ "    <script>\r\n"
				+ "        // Redirect after 5 seconds\r\n"
				+ "        setTimeout(function() {\r\n"
				+ "            alert(\"You will be redirected to the login page.\");\r\n"
				+ "            window.location.href = \"Login\";\r\n"
				+ "        }, 5000);\r\n"
				+ "    </script>\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "");

	
	}

}
