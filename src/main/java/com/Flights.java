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
 * Servlet implementation class Flights
 */
//@WebServlet("/Flights")
public class Flights extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Flights() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String flightID;
        String source;
        String destination;
        String airline;
        String ticketPrice;
        String departureDate;
        String arrivalDate;
        String departureTime;
        String arrivalTime;

        flightID = request.getParameter("FlightID");
        source = request.getParameter("Source");
        destination = request.getParameter("Destination");
        airline = request.getParameter("Airline");
        ticketPrice = request.getParameter("TicketPrice");
        departureDate = request.getParameter("DepartureDate");
        arrivalDate = request.getParameter("ArrivalDate");
        departureTime = request.getParameter("DepartureTime");
        arrivalTime = request.getParameter("ArrivalTime");

        if (flightID == null || source == null || destination == null || airline == null || ticketPrice == null
                || departureDate == null || arrivalDate == null || departureTime == null || arrivalTime == null) {
            // Handle missing or invalid parameters
            response.sendRedirect("Error");
            return;
        }

        InsertDB inDB = new InsertDB();
        DbCon connection = new DbCon();
        try {
            inDB.insertIntoFlights(connection.getCon(), flightID, source, destination, airline, ticketPrice, departureDate, arrivalDate, departureTime, arrivalTime);
            response.sendRedirect("Success");
        } catch (SQLException e) {
            response.sendRedirect("Error");
            System.err.println("Error connecting to the database: " + e.getMessage());
        } 
    }
}
