package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertDB {
	
	
	
	public void insertIntoDB(Connection connection, String userid,String username,String password,String firstName,String lastName,String email,String phoneNumber,String address)
	{
		String insertQuery = "INSERT INTO users VALUES (?,?,?,?,?,?,?,?)";
	    try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
	        preparedStatement.setString(1,userid);	 
	        preparedStatement.setString(2,username);
	        preparedStatement.setString(3,password);
	        preparedStatement.setString(4,firstName);
	        preparedStatement.setString(5,lastName);
	        preparedStatement.setString(6,email);
	        preparedStatement.setString(7,phoneNumber);
	        preparedStatement.setString(8,address);
	        preparedStatement.executeUpdate();
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean checkUser(Connection connection , String username, String password)
	{
		String checkQuery = "SELECT * FROM users WHERE username = ? AND password = ?";
		try (PreparedStatement preparedStatement = connection.prepareStatement(checkQuery)) {
		    preparedStatement.setString(1, username);
		    preparedStatement.setString(2, password);

		    ResultSet resultSet = preparedStatement.executeQuery();
		    if (resultSet.next()) {
		        return true;
		    } 
		} catch (SQLException e) {
		    // Handle any SQL exceptions here
		    e.printStackTrace();
		}		
		return false;
		
	}
	
	
	public void insertIntoPlaces (Connection connection, String placeID, String placeName)
	{
		
		String insertQuery= "Insert into places values (?,?)";
		try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
		    preparedStatement.setString(1, placeID);
		    preparedStatement.setString(2, placeName);
		    preparedStatement.executeUpdate();
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void insertIntoFlights(Connection connection, String flightID,String source,String destination,String airline,String ticketPrice,String depatureDate,String arrivalDate,String depatureTime,String arrivalTime)
	{
		String insertQuery = "INSERT INTO flight VALUES (?,?,?,?,?,?,?,?,?)";
	    try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
	        preparedStatement.setString(1,flightID);	 
	        preparedStatement.setString(2,source);
	        preparedStatement.setString(3,destination);
	        preparedStatement.setString(4,airline);
	        preparedStatement.setString(5,ticketPrice);
	        preparedStatement.setString(6,depatureDate);
	        preparedStatement.setString(7,arrivalDate);
	        preparedStatement.setString(8,depatureTime);
	        preparedStatement.setString(9,arrivalTime);

	        preparedStatement.executeUpdate();
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertIntoBookings(Connection connection , String userid, String source, String destination,String numOfPassengers, String Date, String CardNo,String CardHolderName, String CVV)
	{
		String insertQuery = "INSERT INTO Booking (username, Source, Destination, NumOfPassengers, Date, CardNo, CardHolderName, CVV)"+
				"VALUES (?,?,?,?,?,?,?,?)";
		 try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
		        preparedStatement.setString(1,userid);	 
		        preparedStatement.setString(2,source);
		        preparedStatement.setString(3,destination);
		        preparedStatement.setString(4,numOfPassengers);
		        preparedStatement.setString(5,Date);
		        preparedStatement.setString(6,CardNo);
		        preparedStatement.setString(7,CardHolderName);
		        preparedStatement.setString(8,CVV);     
		        preparedStatement.executeUpdate();
		    } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	

}
