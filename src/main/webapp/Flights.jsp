<!DOCTYPE html>
<html>
<head>
    <title>Flight Information</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        
        h1 {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
        }
        
        form {
            max-width: 400px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }
        
        label {
            display: block;
            margin-top: 10px;
        }
        
        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        
        select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        
          h1, footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
        }
        
        .button-container {
            text-align: center;
        }
        
        .return-link {
            text-align: center;
            margin-top: 20px;
        }
    </style>
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        $(function() {
            $("#DepartureDate").datepicker();
            $("#ArrivalDate").datepicker();
        });
    </script>
</head>
<body>
    <h1>Flight Information</h1>
    <form method="get" action="Flights" id="flightForm">
        <label for="FlightID">Flight ID:</label>
        <input type="text" id="FlightID" name="FlightID" required>
        
        
        
         <label for="destination" class="col-form-label">Source:</label>
					<select class="form-select" name="Source" required>
						<option selected>Select Destination</option>
						<option value="2">Kimberley(ZA)</option>
						<option value="7">Pretoria(ZA)</option>						
						<option value="45">Frans(ZA)</option>
						<option value="789">Johannesburg</option>
						
					</select>
     
        
        <label for="destination" class="col-form-label">Destination:</label>
					<select class="form-select" name="Destination" required>
						<option selected>Select Destination</option>
						<option value="2">Kimberley(ZA)</option>
						<option value="7">Pretoria(ZA)</option>						
						<option value="45">Frans(ZA)</option>
						<option value="789">Johannesburg</option>
						
					</select>

        
        <label for="Airline">Airline:</label>
        <input type="text" id="Airline" name="Airline" required>
        
        <label for="TicketPrice">Ticket Price:</label>
        <input type="text" id="TicketPrice" name="TicketPrice" required>
        
        <label for="DepartureDate">Departure Date:</label>
        <input type="text" id="DepartureDate" name="DepartureDate" required>
        
        <label for="ArrivalDate">Arrival Date:</label>
        <input type="text" id="ArrivalDate" name="ArrivalDate" required>
        
        <label for="DepartureTime">Departure Time:</label>
        <input type="text" id="DepartureTime" name="DepartureTime" required>
        
        <label for="ArrivalTime">Arrival Time:</label>
        <input type="text" id="ArrivalTime" name="ArrivalTime" required>
       
        <div class="button-container">
            <input type="submit" value="Submit">
            <input type="reset" value="Clear">
        </div>
    </form>
    
    <div class="return-link">
        <p>Return to <a href="login.html">Login</a></p>
    </div>
    
    <footer>
        Developed by Elelwani Magoba<br>
        You can contact me at email: <a href="mailto:elelwanimagoba@gmail.com">elelwanimagoba@gmail.com</a>
    </footer>
</body>
</html>
