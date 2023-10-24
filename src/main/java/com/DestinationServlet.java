package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DestinationServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        try {
            // Establish a database connection (replace with your database details).
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdb", "youruser", "yourpassword");

            // Create a SQL query to retrieve destinations from the database.
            String query = "SELECT PlaceName FROM places";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // Create a list of destination names.
            request.setAttribute("destinations", resultSet);

            // Forward the request to a JSP page for rendering.
            RequestDispatcher dispatcher = request.getRequestDispatcher("Flights.jsp");
            dispatcher.forward(request, response);

            // Close database resources.
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
